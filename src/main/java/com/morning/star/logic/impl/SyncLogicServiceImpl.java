package com.morning.star.logic.impl;

import com.morning.star.bean.*;
import com.morning.star.enums.*;
import com.morning.star.logic.SyncLogicService;
import com.morning.star.service.*;
import com.morning.star.utils.objectcopier.ObjectCopier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lenovo on 2017/8/11.
 */
@Service("syncLogicService")
public class SyncLogicServiceImpl implements SyncLogicService {

    private static Long PREFIX = 1800L;

    private static String SPU_PREFIX = "SPU17";

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private UnitsService unitsService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsImgService goodsImgService;
    @Autowired
    private GoodsSpecService goodsSpecService;
    @Autowired
    private StockService stockService;
    @Autowired
    private ProductService productService;
    @Autowired
    private RelationService relationService;

    @Override
    public void syncCategory() {
        List<RetailCategory> list = categoryService.selectTohomeAll();
        if (list != null) {
            list.stream().forEach(category -> {
                category.setId(Long.valueOf(PREFIX + "" + category.getId()));
                if (category.getParentId() > 0) {
                    category.setParentId(Long.valueOf(PREFIX + "" + category.getParentId()));
                }
                category.setCompanyCode(CompanyEnum.TOHOME.getCode());
                categoryService.addCategory(category);
            });
        }
    }

    @Override
    public void syncBrand() {
        List<RetailBrand> list = brandService.selectAll();
        if (list != null) {
            list.stream().forEach(brand -> {
                brand.setId(Long.valueOf(PREFIX + "" + brand.getId()));
                brand.setCompanyCode(CompanyEnum.TOHOME.getCode());
                brandService.addBrand(brand);
            });
        }
    }

    @Override
    public void syncUnits() {
        List<RetailUnits> list = unitsService.selectAll();
        if (list != null) {
            list.stream().forEach(units -> {
                units.setId(Long.valueOf(PREFIX + "" + units.getId()));
                units.setCompanyCode(CompanyEnum.TOHOME.getCode());
                unitsService.addUnits(units);
            });
        }
    }

    @Override
    public void syncStore() {
        List<TohomeStore> list = storeService.selectAll();
        if (list != null) {
            list.stream().forEach(tohomeStore -> {
                RetailStore store = ObjectCopier.copyObject(RetailStore.class, tohomeStore);
                if (tohomeStore.getPayType() != null && tohomeStore.getPayType().equals(0)) {
                    store.setPayType(1);
                }
                if (tohomeStore.getStatus() != null && tohomeStore.getStatus().equals(0)) {
                    store.setStatus(StoreStatusEnum.CLOSE.getCode());
                } else if (tohomeStore.getStatus() != null && tohomeStore.getStatus().equals(1)) {
                    store.setStatus(StoreStatusEnum.OPEN.getCode());
                }
                if (tohomeStore.getDeliverType() != null && tohomeStore.getDeliverType().equals(0)) {
                    store.setDeliverType(DeliverTypeEnum.TO_HOME.getCode());
                }
                store.setLevel(0);
                store.setOperatorId(0);
                store.setOperatorName(CompanyEnum.TOHOME.getCode());
                store.setCompanyCode(CompanyEnum.TOHOME.getCode());
                storeService.addStore(store);
            });
        }
    }

    @Override
    public void syncGoods() {
        List<RelationBean> relationList = listRelation("th_item");
        List<RetailGoods> list = goodsService.selectAll(relationList);
        if (list != null) {
            list.stream().forEach(retailGoods -> {
                retailGoods.setCompanyCode(CompanyEnum.TOHOME.getCode());
                retailGoods.setIsSerialCode(0);
                if (retailGoods.getGuidePrice() == null) {
                    retailGoods.setGuidePrice(BigDecimal.ZERO);
                }
                retailGoods.setGoodsType(retailGoods.getGoodsType().equals("PLU") ? GoodsTypeEnum.SP.getCode() : GoodsTypeEnum.PP.getCode());
                retailGoods.setUnitGoodsCode(retailGoods.getGoodsCode());
                retailGoods.setSaleStatus(ItemStatusEnum.ONSALE.getCode());
                retailGoods.setStandardType(0);
                retailGoods.setStatus(GoodsStatusEnum.ON_MARKET.getCode());
                String spuCode = productService.getSpuCode(retailGoods.getGoodsCode());
                retailGoods.setSpuCode(SPU_PREFIX + autoGenericCode(spuCode, 16));
                retailGoods.setCategoryId1(Long.valueOf(PREFIX + "" + retailGoods.getCategoryId1()));
                retailGoods.setCategoryId2(Long.valueOf(PREFIX + "" + retailGoods.getCategoryId2()));
                retailGoods.setCategoryId3(Long.valueOf(PREFIX + "" + retailGoods.getCategoryId3()));
                RetailUnits units = getUnits(retailGoods.getUnitsId());
                if (units != null) {
                    retailGoods.setUnitsName(units.getUnitsName());
                } else {
                    retailGoods.setUnitsName("");
                }
                retailGoods.setUnitsId(Integer.valueOf(PREFIX + "" + retailGoods.getUnitsId()));
                RetailBrand brand = getBrand(retailGoods.getBrandId());
                if (brand != null) {
                    retailGoods.setBrandName(brand.getBrandName());
                } else {
                    retailGoods.setBrandName("");
                }
                retailGoods.setBrandId(Integer.valueOf(PREFIX + "" + retailGoods.getBrandId()));
                goodsService.addGoods(retailGoods);
            });
        }
    }

    @Override
    public void syncGoodsImg() {
        List<RetailGoodsImg> list = goodsImgService.selectAll();
        if (list != null) {
            list.stream().forEach(retailGoodsImg -> {
                retailGoodsImg.setCompanyCode(CompanyEnum.TOHOME.getCode());
                goodsImgService.addGoodsImg(retailGoodsImg);
            });
        }
    }

    @Override
    public void syncStock() {
        List<RelationBean> list = listRelation("th_item");
        List<RetailStock> stockList = stockService.selectAll();
        if (stockList != null) {
            stockList.stream().forEach(stock -> {
                RetailGoods goods = goodsService.getInfo(list, stock.getGoodsCode());
                stock.setCompanyCode(CompanyEnum.TOHOME.getCode());
                stock.setUsedStockNum(stock.getDoneInStockNum());
                stock.setGoodsName(goods.getGoodsName());
                stock.setGoodsType(goods.getGoodsType().equals("PLU") ? GoodsTypeEnum.SP.getCode() : GoodsTypeEnum.PP.getCode());
                RetailUnits units = getUnits(goods.getUnitsId());
                if (units != null) {
                    stock.setUnits(units.getUnitsName());
                } else {
                    stock.setUnits("");
                }
                stock.setUpcCode(goods.getUpcCode());
                stock.setOperatorId(0);
                stock.setOperatorName("ToHome");
                stockService.addStock(stock);
            });
        }
    }

    @Override
    public void syncGoodsSpec() {
        List<RetailGoodsSpec> list = goodsSpecService.selectAll();
        if (list != null) {
            list.stream().forEach(retailGoodsSpec -> {
                retailGoodsSpec.setSpuCode(SPU_PREFIX + autoGenericCode(retailGoodsSpec.getSpuCode(), 16));
                retailGoodsSpec.setCompanyCode(CompanyEnum.TOHOME.getCode());
                goodsSpecService.addGoodsSpec(retailGoodsSpec);
            });
        }
    }

    private List<RelationBean> listRelation(String name) {
        return relationService.selectAll(name);
    }

    private RetailUnits getUnits(Integer id) {
        return unitsService.getInfo(id);
    }

    private RetailBrand getBrand(Integer id) {
        return brandService.getInfo(id);
    }

    /**
     * 不够位数的在前面补0，保留num的长度位数字
     *
     * @param code
     * @return
     */
    private static String autoGenericCode(String code, int num) {
        String result = "";
        // 保留num的位数
        // 0 代表前面补充0
        // num 代表长度为
        // d 代表参数为正数型
        result = String.format("%0" + num + "d", Integer.valueOf(code));

        return result;
    }
}
