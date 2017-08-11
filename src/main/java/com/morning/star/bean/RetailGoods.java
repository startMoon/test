package com.morning.star.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 货品
 */
public class RetailGoods implements Serializable {

    private static final long serialVersionUID = 559028683041454996L;

    /**
     * 货品ID
     */
    private Integer id;

    /**
     * 货品唯一编码
     */
    private String goodsCode;

    /**
     * 货品名称
     */
    private String goodsName;

    /**
     * 公司编码
     */
    private String companyCode;

    /**
     * spu
     */
    private String spuCode;

    /**
     * upc
     */
    private String upcCode;

    /**
     * 是否为序列号管理，0-否 1-是
     */
    private Integer isSerialCode;

    /**
     * 计量单位ID
     */
    private Integer unitsId;

    /**
     * 计量单位名称
     */
    private String unitsName;

    /**
     * 货品类型 SP-单品,PP-套装
     */
    private String goodsType;

    /**
     * 包装容量
     */
    private Integer packSpecNum;

    /**
     * 包装容量单位（如：箱）
     */
    private String packSpecUnits;

    /**
     * 如果是单品为null，如果是套装，记录套装内对应单品的goods_code
     */
    private String unitGoodsCode;

    /**
     * 流通状态，1：退市 2：上市 3：禁售
     */
    private Integer status;

    /**
     * 线上销售状态（0：下架；1：上架）
     */
    private Integer saleStatus;

    /**
     * 成本价
     */
    private BigDecimal costPrice;

    /**
     * 销售指导价
     */
    private BigDecimal guidePrice;

    /**
     * 销售价
     */
    private BigDecimal salePrice;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 标准类型（0：非称重，1：称重）
     */
    private Integer standardType;

    /**
     * 货品重量
     */
    private String weight;

    /**
     * 货品介绍
     */
    private String goodsIntroduce;

    /**
     * 一级类目ID
     */
    private Long categoryId1;

    /**
     * 二级类目ID
     */
    private Long categoryId2;

    /**
     * 三级类目ID
     */
    private Long categoryId3;

    /**
     * 标签ID（逗号分隔）
     */
    private String tagIds;

    /**
     * 自定义字段值，json格式
     */
    private String customAttrs;

    /**
     * 保质期（天）
     */
    private Integer shelfLife;

    /**
     * 货品展示图
     */
    private String iconPath;

    /**
     * 权重
     */
    private Integer priority;

    /**
     * 删除标记（0：正常；1：删除）
     */
    private Integer deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 操作人ID
     */
    private Integer operatorId;

    /**
     * 操作人名称
     */
    private String operatorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getSpuCode() {
        return spuCode;
    }

    public void setSpuCode(String spuCode) {
        this.spuCode = spuCode;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public Integer getIsSerialCode() {
        return isSerialCode;
    }

    public void setIsSerialCode(Integer isSerialCode) {
        this.isSerialCode = isSerialCode;
    }

    public Integer getUnitsId() {
        return unitsId;
    }

    public void setUnitsId(Integer unitsId) {
        this.unitsId = unitsId;
    }

    public String getUnitsName() {
        return unitsName;
    }

    public void setUnitsName(String unitsName) {
        this.unitsName = unitsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getPackSpecNum() {
        return packSpecNum;
    }

    public void setPackSpecNum(Integer packSpecNum) {
        this.packSpecNum = packSpecNum;
    }

    public String getPackSpecUnits() {
        return packSpecUnits;
    }

    public void setPackSpecUnits(String packSpecUnits) {
        this.packSpecUnits = packSpecUnits;
    }

    public String getUnitGoodsCode() {
        return unitGoodsCode;
    }

    public void setUnitGoodsCode(String unitGoodsCode) {
        this.unitGoodsCode = unitGoodsCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(BigDecimal guidePrice) {
        this.guidePrice = guidePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getStandardType() {
        return standardType;
    }

    public void setStandardType(Integer standardType) {
        this.standardType = standardType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public Long getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Long categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Long getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Long categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public Long getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(Long categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getCustomAttrs() {
        return customAttrs;
    }

    public void setCustomAttrs(String customAttrs) {
        this.customAttrs = customAttrs;
    }

    public Integer getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(Integer shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
