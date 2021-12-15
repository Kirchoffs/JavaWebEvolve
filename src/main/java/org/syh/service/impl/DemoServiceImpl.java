package org.syh.service.impl;

import org.syh.dao.DemoDao;
import org.syh.dao.impl.DemoDaoImpl;
import org.syh.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {
    private DemoDao demoDao = new DemoDaoImpl();
    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
