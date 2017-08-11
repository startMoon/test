package com.morning.star.dao;

import com.morning.star.bean.RetailStore;
import com.morning.star.bean.TohomeStore;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface StoreDAO {
    
    List<TohomeStore> selectAll();

    int addStore(RetailStore retailStore);
}
