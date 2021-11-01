// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.lfsenior.sql.parser.doris.analysis;

import com.lfsenior.sql.parser.doris.catalog.PartitionType;
import com.google.common.collect.Lists;

import java.util.List;

// to describe the key range partition's information in create table stmt
public class RangePartitionDesc extends PartitionDesc {
    private List<String> partitionColNames;
    private List<SingleRangePartitionDesc> singleRangePartitionDescs;

    public RangePartitionDesc(List<String> partitionColNames,
                              List<SingleRangePartitionDesc> singlePartitionDescs) {
        type = PartitionType.RANGE;
        this.partitionColNames = partitionColNames;
        this.singleRangePartitionDescs = singlePartitionDescs;
        if (singleRangePartitionDescs == null) {
            singleRangePartitionDescs = Lists.newArrayList();
        }
    }

    public List<SingleRangePartitionDesc> getSingleRangePartitionDescs() {
        return this.singleRangePartitionDescs;
    }

    public List<String> getPartitionColNames() {
        return partitionColNames;
    }


    @Override
    public String toSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTITION BY RANGE(");
        int idx = 0;
        for (String column : partitionColNames) {
            if (idx != 0) {
                sb.append(", ");
            }
            sb.append("`").append(column).append("`");
            idx++;
        }
        sb.append(")\n(\n");

        for (int i = 0; i < singleRangePartitionDescs.size(); i++) {
            if (i != 0) {
                sb.append(",\n");
            }
            sb.append(singleRangePartitionDescs.get(i).toSql());
        }
        sb.append("\n)");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toSql();
    }

}
