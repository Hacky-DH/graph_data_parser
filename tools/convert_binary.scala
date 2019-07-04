// require Euler/tools/graph_data_parser graph_data_parser-1.0.jar
import graph_data_parser._
import com.alibaba.fastjson._
import org.apache.spark.sql.SparkSession

object Convert {
    def main(args: Array[String]) {
        var partitionNum = 8
        var inputDir = "hdfs:///inputDir"
        val metaFile = "meta.txt"
        val dataFile = "data.txt"
        var hdfsDir = "hdfs:///dir"
        var outputFile = "graph/euler/v2/binary/data"
        if (args.length >= 4) {
            partitionNum = args(0).toInt
            inputDir = args(1)
            hdfsDir = args(2)
            outputFile = args(3)
        }
        val spark = SparkSession.builder.appName("Convert Application").getOrCreate()

        def getWriter(idx:Int): HDFSWriter = {
            new HDFSWriter(hdfsDir, s"${outputFile}_${idx}.dat")
        }

        val metaStr = spark.read.textFile(inputDir + metaFile).first()
        val cnt = spark.read.textFile(inputDir + dataFile).repartition(partitionNum).rdd.mapPartitionsWithIndex {
                (idx, iter) => {
                    val writer = getWriter(idx)
                    iter.map { x =>
                        val meta: Meta = JSON.parseObject(metaStr, classOf[Meta])
                        val block: Block = JSON.parseObject(x, classOf[Block])
                        val bytes = new BlockParser(meta).BlockJsonToBytes(block)
                        writer.writeBytes(bytes)
                        writer.hflush
                        (idx, bytes)
                    }
                }
            }.count
        println(cnt)
        println("done")
    }
}
