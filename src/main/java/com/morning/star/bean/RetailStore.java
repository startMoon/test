package com.morning.star.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RetailStore implements Serializable {

    private static final long serialVersionUID = 4513502104947576129L;

    /**
     * 门店编码
     */
    private String storeCode;
    /**
     * 门店名称
     */
    private String storeName;
    /**
     * 公司编码
     */
    private String companyCode;
    /**
     * 负责人
     */
    private String manager;
    /**
     * 负责人邮箱
     */
    private String email;
    /**
     * 负责人电话
     */
    private String mobile;
    /**
     * 负责人qq
     */
    private String qq;
    /**
     * 门店等级（0-普通 1-良好 2-优秀）
     */
    private Integer level;
    /**
     * 经营模式（0：直营；1：联营；2：加盟；3：入驻）
     */
    private Integer model;
    /**
     * 库存管理模式（0：总部维护；1：门店维护；2：共同维护）
     */
    private Integer stockModel;
    /**
     * 门店最大pos数量
     */
    private Integer maxPosNum;
    /**
     * 门店电话
     */
    private String tel;
    /**
     * 门店位置-经度
     */
    private String longitude;
    /**
     * 门店位置-纬度
     */
    private String latitude;
    /**
     * 门店地址
     */
    private String address;
    /**
     * 省
     */
    private Long provinceId;
    /**
     * 市
     */
    private Long cityId;
    /**
     * 区
     */
    private Long countyId;
    /**
     * 营业开始时间
     */
    private String openTime;
    /**
     * 营业结束时间
     */
    private String closeTime;
    /**
     * 门店营业状态 (OPEN-营业中；CLOSE-关闭中)
     */
    private String status;
    /**
     * 是否冻结（0-正常 ，1-已冻结）
     */
    private Integer isFree;
    /**
     * 支付方式（1：线上支付）
     */
    private Integer payType;
    /**
     * 配送方式（1：送货上门；2：门店自提）
     */
    private String deliverType;
    /**
     * 配送范围
     */
    private String deliverRange;
    /**
     * 配送配置(配置1)
     */
    private String postageConfig;
    /**
     * 免运费订单金额，即订单金额超过多少则免运费
     */
    private BigDecimal freePostageOrderFee;
    /**
     * 运费
     */
    private BigDecimal postageFee;
    /**
     * 即时送服务
     */
    private String instantService;
    /**
     * 每日下单结束时间，在此时间前下单即可满足即时送
     */
    private String orderEndTime;
    /**
     * 次日达服务
     */
    private String nextdayService;
    /**
     * 售后服务
     */
    private String customerService;
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
     * 操作人姓名
     */
    private String operatorName;
    /**
     * 详情备注
     */
    private String remark;

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getStockModel() {
        return stockModel;
    }

    public void setStockModel(Integer stockModel) {
        this.stockModel = stockModel;
    }

    public Integer getMaxPosNum() {
        return maxPosNum;
    }

    public void setMaxPosNum(Integer maxPosNum) {
        this.maxPosNum = maxPosNum;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(String deliverType) {
        this.deliverType = deliverType;
    }

    public String getDeliverRange() {
        return deliverRange;
    }

    public void setDeliverRange(String deliverRange) {
        this.deliverRange = deliverRange;
    }

    public String getPostageConfig() {
        return postageConfig;
    }

    public void setPostageConfig(String postageConfig) {
        this.postageConfig = postageConfig;
    }

    public BigDecimal getFreePostageOrderFee() {
        return freePostageOrderFee;
    }

    public void setFreePostageOrderFee(BigDecimal freePostageOrderFee) {
        this.freePostageOrderFee = freePostageOrderFee;
    }

    public BigDecimal getPostageFee() {
        return postageFee;
    }

    public void setPostageFee(BigDecimal postageFee) {
        this.postageFee = postageFee;
    }

    public String getInstantService() {
        return instantService;
    }

    public void setInstantService(String instantService) {
        this.instantService = instantService;
    }

    public String getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(String orderEndTime) {
        this.orderEndTime = orderEndTime;
    }

    public String getNextdayService() {
        return nextdayService;
    }

    public void setNextdayService(String nextdayService) {
        this.nextdayService = nextdayService;
    }

    public String getCustomerService() {
        return customerService;
    }

    public void setCustomerService(String customerService) {
        this.customerService = customerService;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
