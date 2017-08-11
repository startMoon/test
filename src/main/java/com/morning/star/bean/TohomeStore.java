package com.morning.star.bean;

import java.io.Serializable;
import java.util.Date;

public class TohomeStore implements Serializable {

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
    private Integer status;

    /**
     * 支付方式（1：线上支付）
     */
    private Integer payType;

    /**
     * 配送方式（1：送货上门；2：门店自提）
     */
    private Integer deliverType;

    /**
     * 配送范围
     */
    private String deliverRange;

    /**
     * 配送配置(配置1)
     */
    private String postageConfig;

    /**
     * 创建时间
     */
    private Date createTime;


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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(Integer deliverType) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
