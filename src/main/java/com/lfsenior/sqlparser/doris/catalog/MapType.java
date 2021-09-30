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

import com.google.common.base.Preconditions;
import lombok.Data;

/**
 * Describes a MAP type. MAP types have a scalar key and an arbitrarily-typed value.
 */
@Data
public class MapType extends Type {
    private final Type keyType;
    private final Type valueType;

    public MapType(Type keyType, Type valueType) {
        Preconditions.checkNotNull(keyType);
        Preconditions.checkNotNull(valueType);
        this.keyType = keyType;
        this.valueType = valueType;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MapType)) {
            return false;
        }
        MapType otherMapType = (MapType) other;
        return otherMapType.keyType.equals(keyType)
                && otherMapType.valueType.equals(valueType);
    }

    public String toSql(int depth) {
        if (depth >= MAX_NESTING_DEPTH) {
            return "MAP<...>";
        }
        return String.format("MAP<%s,%s>",
                keyType.toSql(depth + 1), valueType.toSql(depth + 1));
    }
}

