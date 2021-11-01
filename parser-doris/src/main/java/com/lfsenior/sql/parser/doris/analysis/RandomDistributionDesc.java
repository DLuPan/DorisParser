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


import com.lfsenior.sql.parser.doris.catalog.DistributionInfo;

@Deprecated
public class RandomDistributionDesc extends DistributionDesc {
    int numBucket;

    public RandomDistributionDesc() {
        type = DistributionInfo.DistributionInfoType.RANDOM;
    }

    public RandomDistributionDesc(int numBucket) {
        type = DistributionInfo.DistributionInfoType.RANDOM;
        this.numBucket = numBucket;
    }

    public String toSql() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DISTRIBUTED BY RANDOM\n")
                .append("BUCKETS ").append(numBucket);
        return stringBuilder.toString();
    }
}
