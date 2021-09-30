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


import lombok.Data;

/**
 * TODO: Support comments for struct fields. The Metastore does not properly store
 * comments of struct fields. We set comment to null to avoid compatibility issues.
 */
@Data
public class StructField {
    protected final String name;
    protected final Type type;
    protected final String comment;
    protected int position;  // in struct

    public StructField(String name, Type type, String comment) {
        this.name = name;
        this.type = type;
        this.comment = comment;
    }

    public StructField(String name, Type type) {
        this(name, type, null);
    }


    public String toSql(int depth) {
        String typeSql = (depth < Type.MAX_NESTING_DEPTH) ? type.toSql(depth) : "...";
        StringBuilder sb = new StringBuilder(name);
        if (type != null) {
            sb.append(":" + typeSql);
        }
        if (comment != null) {
            sb.append(String.format(" COMMENT '%s'", comment));
        }
        return sb.toString();
    }

}


