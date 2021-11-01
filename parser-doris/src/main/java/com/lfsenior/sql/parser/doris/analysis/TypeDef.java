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

import com.lfsenior.sql.parser.doris.catalog.PrimitiveType;
import com.lfsenior.sql.parser.doris.catalog.ScalarType;
import com.lfsenior.sql.parser.doris.catalog.Type;
import lombok.Data;

/**
 * Represents an anonymous type definition, e.g., used in DDL and CASTs.
 */
@Data
public class TypeDef implements ParseNode {
    private final Type parsedType;

    public TypeDef(Type parsedType) {
        this.parsedType = parsedType;
    }

    public static TypeDef create(PrimitiveType type) {
        return new TypeDef(ScalarType.createType(type));
    }

    public static TypeDef createDecimal(int precision, int scale) {
        return new TypeDef(ScalarType.createDecimalType(precision, scale));
    }

    public static TypeDef createVarchar(int len) {
        return new TypeDef(ScalarType.createVarchar(len));
    }

    public static TypeDef createChar(int len) {
        return new TypeDef(ScalarType.createChar(len));
    }

    public Type getType() {
        return parsedType;
    }

    @Override
    public String toString() {
        return parsedType.toSql();
    }

    @Override
    public String toSql() {
        return parsedType.toSql();
    }
}
