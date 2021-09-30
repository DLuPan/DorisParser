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

package com.lfsenior.sqlparser.doris.catalog;

import com.google.common.base.MoreObjects;
import lombok.Data;

/**
 * Statistics for a single column.
 */
@Data
public class ColumnStats {

    private float avgSerializedSize;  // in bytes; includes serialization overhead
    private long maxSize;  // in bytes
    private long numDistinctValues;
    private long numNulls;

    /**
     * For fixed-length type (those which don't need additional storage besides
     * the slot they occupy), sets avgSerializedSize and maxSize to their slot size.
     */
    public ColumnStats() {
        avgSerializedSize = -1;
        maxSize = -1;
        numDistinctValues = -1;
        numNulls = -1;
    }

    public ColumnStats(ColumnStats other) {
        avgSerializedSize = other.avgSerializedSize;
        maxSize = other.maxSize;
        numDistinctValues = other.numDistinctValues;
        numNulls = other.numNulls;
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this.getClass()).add("avgSerializedSize",
                avgSerializedSize).add("maxSize", maxSize).add("numDistinct", numDistinctValues).add(
                "numNulls", numNulls).toString();
    }


    /**
     * For fixed-length type (those which don't need additional storage besides
     * the slot they occupy), sets avgSerializedSize and maxSize to their slot size.
     */
    public ColumnStats(PrimitiveType colType) {
        avgSerializedSize = -1;
        maxSize = -1;
        numDistinctValues = -1;
        numNulls = -1;
        if (colType.isNumericType() || colType.isDateType()) {
            avgSerializedSize = colType.getSlotSize();
            maxSize = colType.getSlotSize();
        }
    }
}
