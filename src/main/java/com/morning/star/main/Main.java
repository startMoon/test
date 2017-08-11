package com.morning.star.main;

import com.morning.star.bean.*;
import com.morning.star.enums.*;
import com.morning.star.logic.SyncLogicService;
import com.morning.star.service.*;
import com.morning.star.utils.objectcopier.ObjectCopier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/8/10.
 */
public class Main {

    private static ClassPathXmlApplicationContext context;

    private static SyncLogicService syncLogicService;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("classpath*:applicationContext-jdbc.xml");
        syncLogicService = (SyncLogicService) context.getBean("syncLogicService");
        sync();
    }

    private static void sync() {
        syncLogicService.syncCategory();
        syncLogicService.syncBrand();
        syncLogicService.syncUnits();
        syncLogicService.syncStore();
        syncLogicService.syncGoods();
        syncLogicService.syncGoodsImg();
        syncLogicService.syncStock();
        syncLogicService.syncGoodsSpec();
    }

}
