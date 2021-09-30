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

package com.lfsenior.sqlparser.doris.analysis;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

/*
 * To represent following stmt:
 *      PARTITION p1
 *      TEMPORARY PARTITION p1
 *      PARTITION (p1, p2)
 *      TEMPORARY PARTITION (p1, p2)
 *      PARTITIONS (p1, p2)
 *      TEMPORARY PARTITIONS (p1, p2)
 */
public class PartitionNames implements ParseNode {

    private final List<String> partitionNames;
    // true if these partitions are temp partitions
    private final boolean isTemp;

    public PartitionNames(boolean isTemp, List<String> partitionNames) {
        this.partitionNames = partitionNames;
        this.isTemp = isTemp;
    }

    public PartitionNames(PartitionNames other) {
        this.partitionNames = Lists.newArrayList(other.partitionNames);
        this.isTemp = other.isTemp;
    }

    public List<String> getPartitionNames() {
        return partitionNames;
    }

    public boolean isTemp() {
        return isTemp;
    }


    @Override
    public String toSql() {
        if (partitionNames == null || partitionNames.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (isTemp) {
            sb.append("TEMPORARY ");
        }
        sb.append("PARTITIONS (");
        sb.append(Joiner.on(", ").join(partitionNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public String toString() {
        return toSql();
    }

}
