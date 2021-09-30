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

import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Alter table statement.
@Getter
@Setter
public class AlterTableStmt extends DdlStmt {
    private TableName tbl;
    private List<AlterClause> ops;

    public AlterTableStmt(TableName tbl, List<AlterClause> ops) {
        this.tbl = tbl;
        this.ops = ops;
    }

    public void setTableName(String newTableName) {
        tbl = new TableName(tbl.getDb(), newTableName);
    }

    public TableName getTbl() {
        return tbl;
    }

    public List<AlterClause> getOps() {
        return ops;
    }

    @Override
    public String toSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE ").append(tbl.toSql()).append(" ");
        int idx = 0;
        for (AlterClause op : ops) {
            if (idx != 0) {
                sb.append(", \n");
            }
            if (op instanceof AddRollupClause) {
                if (idx == 0) {
                    sb.append("ADD ROLLUP");
                }
                sb.append(op.toSql().replace("ADD ROLLUP", ""));
            } else if (op instanceof DropRollupClause) {
                if (idx == 0) {
                    sb.append("DROP ROLLUP ");
                }
                sb.append(((AddRollupClause) op).getRollupName());
            } else {
                sb.append(op.toSql());
            }
            idx++;
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return toSql();
    }
}
