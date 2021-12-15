package org.syh.dao.impl;

import org.syh.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("a", "b", "c");
    }
}

