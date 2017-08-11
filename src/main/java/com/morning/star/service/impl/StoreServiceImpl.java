package com.morning.star.service.impl;

import com.morning.star.bean.RetailStore;
import com.morning.star.bean.TohomeStore;
import com.morning.star.dao.StoreDAO;
import com.morning.star.enums.StoreStatusEnum;
import com.morning.star.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
@Service("storeService")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreDAO storeDAO;

    @Override
    public List<TohomeStore> selectAll() {
        return this.storeDAO.selectAll();
    }

    @Override
    public int addStore(RetailStore retailStore) {
        return this.storeDAO.addStore(retailStore);
    }
}
