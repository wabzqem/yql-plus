/*
 * Copyright (c) 2016 Yahoo Inc.
 * Licensed under the terms of the Apache version 2.0 license.
 * See LICENSE file for terms.
 */

package com.yahoo.yqlplus.engine.java;

import com.yahoo.yqlplus.api.Source;
import com.yahoo.yqlplus.api.annotations.Query;

import java.util.List;

public class PrimitiveSource implements Source {
    private List<PrimitiveRecord> scan;

    public PrimitiveSource(List<PrimitiveRecord> scan) {
        this.scan = scan;
    }

    @Query
    public List<PrimitiveRecord> query() {
        return scan;
    }
}
