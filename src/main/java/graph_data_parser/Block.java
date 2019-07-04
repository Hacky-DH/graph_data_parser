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

public class Block {
  private long node_id;
  private int node_type;
  private float node_weight;
  private HashMap<Integer, HashMap<Long, Float>> neighbor;
  private HashMap<Integer, ArrayList<Long>> uint64_feature;
  private HashMap<Integer, ArrayList<Float>> float_feature;
  private HashMap<Integer, String> binary_feature;
  private ArrayList<Edge> edge;

  public Block() {
    neighbor = new HashMap<>();
    uint64_feature = new HashMap<>();
    float_feature = new HashMap<>();
    binary_feature = new HashMap<>();
    edge = new ArrayList<>();
  }

  public long getNode_id() {
    return node_id;
  }

  public void setNode_id(long node_id) {
    this.node_id = node_id;
  }

  public int getNode_type() {
    return node_type;
  }

  public void setNodeType(int node_type) {
    this.node_type = node_type;
  }

  public float getNode_weight() {
    return node_weight;
  }

  public void setNode_weight(float node_weight) {
    this.node_weight = node_weight;
  }

  public HashMap<Integer, HashMap<Long, Float>> getNeighbor() {
    return neighbor;
  }

  public void setNeighbor(HashMap<Integer, HashMap<Long, Float>> neighbor) {
    this.neighbor = neighbor;
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

  public ArrayList<Edge> getEdge() {
    return edge;
  }

  public void setEdge(ArrayList<Edge> edge) {
    this.edge = edge;
  }
}
