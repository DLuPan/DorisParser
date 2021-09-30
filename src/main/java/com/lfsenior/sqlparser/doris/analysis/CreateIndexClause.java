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

import com.google.common.collect.Maps;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CreateIndexClause extends AlterTableClause {
    // in which table the index on, only used when alter = false
    private TableName tableName;
    // index definition class
    private IndexDef indexDef;
    // when alter = true, clause like: alter table add index xxxx
    // when alter = false, clause like: create index xx on table xxxx
    private boolean alter;
    // index internal class
    private Index index;

    public CreateIndexClause(TableName tableName, IndexDef indexDef, boolean alter) {
        super(AlterOpType.SCHEMA_CHANGE);
        this.tableName = tableName;
        this.indexDef = indexDef;
        this.alter = alter;
    }

    @Override
    public Map<String, String> getProperties() {
        return Maps.newHashMap();
    }

    @Override
    public String toSql() {
        if (alter) {
            return indexDef.toSql();
        } else {
            return "CREATE " + indexDef.toSql(tableName.toSql());
        }
    }
}
