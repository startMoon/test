package com.morning.star.service;

import com.morning.star.bean.RelationBean;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public interface RelationService {

    List<RelationBean> selectAll(String name);

}
