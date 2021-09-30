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

import com.lfsenior.sqlparser.doris.common.util.PrintableMap;

import java.util.Map;

public class EnableFeatureClause extends AlterTableClause {

    public enum Features {
        BATCH_DELETE,
        SEQUENCE_LOAD,
        UNKNOWN
    }

    private String featureName;
    private boolean needSchemaChange;
    private Features feature;
    private Map<String, String> properties;

    public EnableFeatureClause(String featureName) {
        this(featureName, null);
    }

    public EnableFeatureClause(String featureName, Map<String, String> properties) {
        super(AlterOpType.ENABLE_FEATURE);
        this.featureName = featureName;
        this.needSchemaChange = false;
        this.properties = properties;
    }

    @Override
    public Map<String, String> getProperties() {
        return this.properties;
    }


    @Override
    public String toSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("ENABLE FEATURE \"").append(featureName).append("\"");
        if (properties != null && !properties.isEmpty()) {
            sb.append(" WITH PROPERTIES (");
            sb.append(new PrintableMap<String, String>(properties, "=", true, false));
            sb.append(")");
        }
        return sb.toString();
    }
}
