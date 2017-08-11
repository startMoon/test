package com.morning.star.bean;

import java.io.Serializable;

public class RetailGoodsImg implements Serializable {

    private static final long serialVersionUID = -7215102471699654516L;
    private long id;
    private String goodsCode;
    private String imgUri;
    private Integer imgType;
    private Integer defaultImg;
    private Integer sort;
    private String companyCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getSort() {
        return sort;
    }


}
