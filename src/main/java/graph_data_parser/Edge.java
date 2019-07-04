/* Copyright 2018 Alibaba Group Holding Limited. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

package graph_data_parser;

import java.util.ArrayList;
import java.util.HashMap;

class Edge {
  private long src_id;
  private long dst_id;
  private int edge_type;
  private float weight;
  private HashMap<Integer, ArrayList<Long>> uint64_feature;
  private HashMap<Integer, ArrayList<Float>> float_feature;
  private HashMap<Integer, String> binary_feature;

  public Edge() {
    uint64_feature = new HashMap<>();
    float_feature = new HashMap<>();
    binary_feature = new HashMap<>();
  }

  public long getSrc_id() {
    return src_id;
  }

  public void setSrc_id(long src_id) {
    this.src_id = src_id;
  }

  public long getDst_id() {
    return dst_id;
  }

  public void setDst_id(long dst_id) {
    this.dst_id = dst_id;
  }

  public int getEdge_type() {
    return edge_type;
  }

  public void setEdge_type(int edge_type) {
    this.edge_type = edge_type;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public HashMap<Integer, ArrayList<Long>> getUint64_feature() {
    return uint64_feature;
  }

  public void setUint64_feature(HashMap<Integer, ArrayList<Long>> uint64_feature) {
    this.uint64_feature = uint64_feature;
  }

  public HashMap<Integer, ArrayList<Float>> getFloat_feature() {
    return float_feature;
  }

  public void setFloat_feature(HashMap<Integer, ArrayList<Float>> float_feature) {
    this.float_feature = float_feature;
  }

  public HashMap<Integer, String> getBinary_feature() {
    return binary_feature;
  }

  public void setBinary_feature(HashMap<Integer, String> binary_feature) {
    this.binary_feature = binary_feature;
  }
}
