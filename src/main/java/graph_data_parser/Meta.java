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

import com.alibaba.fastjson.JSONObject;

public class Meta {
  private int node_type_num;
  private int edge_type_num;
  private int node_uint64_feature_num;
  private int node_float_feature_num;
  private int node_binary_feature_num;
  private int edge_uint64_feature_num;
  private int edge_float_feature_num;
  private int edge_binary_feature_num;

  public Meta() {

  }

  public Meta(JSONObject obj){
    node_type_num = obj.getIntValue("node_type_num");
    edge_type_num = obj.getIntValue("edge_type_num");
    node_uint64_feature_num = obj.getIntValue("node_uint64_feature_num");
    node_float_feature_num = obj.getIntValue("node_float_feature_num");
    node_binary_feature_num = obj.getIntValue("node_binary_feature_num");
    edge_uint64_feature_num = obj.getIntValue("edge_uint64_feature_num");
    edge_float_feature_num = obj.getIntValue("edge_float_feature_num");
    edge_binary_feature_num = obj.getIntValue("edge_binary_feature_num");
  }

  public int getNode_type_num() {
    return node_type_num;
  }

  public void setNode_type_num(int v) {
    node_type_num = v;
  }

  public int getEdge_type_num() {
    return edge_type_num;
  }

  public void setEdge_type_num(int v) {
    edge_type_num = v;
  }

  public int getNode_uint64_feature_num() {
    return node_uint64_feature_num;
  }

  public void setNode_uint64_feature_num(int v) {
    node_uint64_feature_num = v;
  }

  public int getNode_float_feature_num() {
    return node_float_feature_num;
  }

  public void setNode_float_feature_num(int v) {
    node_float_feature_num = v;
  }

  public int getNode_binary_feature_num() {
    return node_binary_feature_num;
  }

  public void setNode_binary_feature_num(int v) {
    node_binary_feature_num = v;
  }

  public int getEdge_uint64_feature_num() {
    return edge_uint64_feature_num;
  }

  public void setEdge_uint64_feature_num(int v) {
    edge_uint64_feature_num = v;
  }

  public int getEdge_float_feature_num() {
    return edge_float_feature_num;
  }

  public void setEdge_float_feature_num(int v) {
    edge_float_feature_num = v;
  }

  public int getEdge_binary_feature_num() {
    return edge_binary_feature_num;
  }

  public void setEdge_binary_feature_num(int v) {
    edge_binary_feature_num = v;
  }
}
