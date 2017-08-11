package com.morning.star.service.impl;

import com.morning.star.bean.RelationBean;
import com.morning.star.dao.RelationDAO;
import com.morning.star.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("relationService")
public class RelationServiceImpl implements RelationService {

    @Autowired
    private RelationDAO relationDAO;

    @Override
    public List<RelationBean> selectAll(String name) {
        return this.relationDAO.selectAll(name);
    }
}
