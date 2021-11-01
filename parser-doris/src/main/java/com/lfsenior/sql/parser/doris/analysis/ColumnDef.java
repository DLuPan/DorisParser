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

import com.lfsenior.sql.parser.doris.catalog.AggregateType;
import lombok.Data;

@Data
public class ColumnDef {
    public static class DefaultValue {
        public boolean isSet;
        public String value;

        public DefaultValue(boolean isSet, String value) {
            this.isSet = isSet;
            this.value = value;
        }

        // no default value
        public static DefaultValue NOT_SET = new DefaultValue(false, null);
        // default null
        public static DefaultValue NULL_DEFAULT_VALUE = new DefaultValue(true, null);
        public static String ZERO = new String(new byte[]{0});
        // default "value", "0" means empty hll
        public static DefaultValue HLL_EMPTY_DEFAULT_VALUE = new DefaultValue(true, ZERO);
        // default "value", "0" means empty bitmap
        public static DefaultValue BITMAP_EMPTY_DEFAULT_VALUE = new DefaultValue(true, ZERO);
    }

    // parameter initialized in constructor
    private String name;
    private TypeDef typeDef;
    private AggregateType aggregateType;
    private boolean isKey;
    private boolean isAllowNull;
    private DefaultValue defaultValue;
    private String comment;
    private boolean visible;

    public ColumnDef(String name, TypeDef typeDef) {
        this.name = name;
        this.typeDef = typeDef;
        this.comment = "";
        this.defaultValue = DefaultValue.NOT_SET;
    }

    public ColumnDef(String name, TypeDef typeDef, boolean isKey, AggregateType aggregateType,
                     boolean isAllowNull, DefaultValue defaultValue, String comment) {
        this(name, typeDef, isKey, aggregateType, isAllowNull, defaultValue, comment, true);
    }

    public ColumnDef(String name, TypeDef typeDef, boolean isKey, AggregateType aggregateType,
                     boolean isAllowNull, DefaultValue defaultValue, String comment, boolean visible) {
        this.name = name;
        this.typeDef = typeDef;
        this.isKey = isKey;
        this.aggregateType = aggregateType;
        this.isAllowNull = isAllowNull;
        this.defaultValue = defaultValue;
        this.comment = comment;
        this.visible = visible;
    }

    public String toSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("`").append(name).append("` ");
        sb.append(typeDef.toSql()).append(" ");

        if (aggregateType != null) {
            sb.append(aggregateType.name()).append(" ");
        }

        if (!isAllowNull) {
            sb.append("NOT NULL ");
        } else {
            // should append NULL to make result can be executed right.
            sb.append("NULL ");
        }

        if (defaultValue.isSet) {
            sb.append("DEFAULT \"").append(defaultValue.value).append("\" ");
        }
        sb.append("COMMENT \"").append(comment).append("\"");

        return sb.toString();
    }

    @Override
    public String toString() {
        return toSql();
    }
}
