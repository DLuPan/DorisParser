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

import com.google.common.collect.Lists;
import com.lfsenior.sqlparser.doris.catalog.DistributionInfo;

import java.util.List;

public class HashDistributionDesc extends DistributionDesc {
    private int numBucket;
    private List<String> distributionColumnNames;

    public HashDistributionDesc() {
        type = DistributionInfo.DistributionInfoType.HASH;
        distributionColumnNames = Lists.newArrayList();
    }

    public HashDistributionDesc(int numBucket, List<String> distributionColumnNames) {
        type = DistributionInfo.DistributionInfoType.HASH;
        this.numBucket = numBucket;
        this.distributionColumnNames = distributionColumnNames;
    }

    public List<String> getDistributionColumnNames() {
        return distributionColumnNames;
    }

    public int getBuckets() {
        return numBucket;
    }


    public String toSql() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DISTRIBUTED BY HASH(");
        int i = 0;
        for (String columnName : distributionColumnNames) {
            if (i != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("`").append(columnName).append("`");
            i++;
        }
        stringBuilder.append(")\n");
        stringBuilder.append("BUCKETS ").append(numBucket);
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toSql();
    }

}
