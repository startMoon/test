package com.morning.star.service.impl;

import com.morning.star.bean.RetailUnits;
import com.morning.star.dao.UnitsDAO;
import com.morning.star.service.UnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("unitsService")
public class UnitsServiceImpl implements UnitsService {

    @Autowired
    private UnitsDAO unitsDAO;

    @Override
    public List<RetailUnits> selectAll() {
        return this.unitsDAO.selectAll();
    }

    @Override
    public RetailUnits getInfo(Integer id) {
        return this.unitsDAO.getInfo(id);
    }

    @Override
    public int addUnits(RetailUnits retailUnits) {
        return this.unitsDAO.addUnits(retailUnits);
    }
}
