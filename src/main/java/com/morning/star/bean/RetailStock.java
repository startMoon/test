package com.morning.star.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 库存
 *
 * @author jiangyf
 */
public class RetailStock implements Serializable {

    private static final long serialVersionUID = 3871422085023566734L;

    /**
     * 记录ID
     */
    private Integer id;
    /**
     * 公司编码
     */
    private String companyCode;
    /**
     * 仓库编码（门店编码）
     */
    private String warehouseCode;
    /**
     * 货品编码
     */
    private String goodsCode;
    /**
     * 货品名称
     */
    private String goodsName;
    /**
     * 条形码
     */
    private String upcCode;
    /**
     * 在库数量
     */
    private Integer doneInStockNum;
    /**
     * 可售数量
     */
    private Integer usedStockNum;
    /**
     * 待入数量（采购，补货）
     */
    private Integer waitInStockNum;
    /**
     * 占用数量（订单）
     */
    private Integer preStockNum;
    /**
     * 待出数量（订单）
     */
    private Integer waitOutStockNum;
    /**
     * 已出数量（订单）
     */
    private Integer doneOutStockNum;
    /**
     * 计量单位（如：个）
     */
    private String units;
    /**
     * 货品类型 SP-单品,PP-套装
     */
    private String goodsType;
    /**
     * 包装容量
     */
    private Integer specNum;
    /**
     * 包装容量单位（如：箱）
     */
    private String specUnits;
    /**
     * 删除标记，0：正常；1：删除
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
     * 操作人姓名
     */
    private String operatorName;
    /**
     * 详情备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
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

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public Integer getDoneInStockNum() {
        return doneInStockNum;
    }

    public void setDoneInStockNum(Integer doneInStockNum) {
        this.doneInStockNum = doneInStockNum;
    }

    public Integer getUsedStockNum() {
        return usedStockNum;
    }

    public void setUsedStockNum(Integer usedStockNum) {
        this.usedStockNum = usedStockNum;
    }

    public Integer getWaitInStockNum() {
        return waitInStockNum;
    }

    public void setWaitInStockNum(Integer waitInStockNum) {
        this.waitInStockNum = waitInStockNum;
    }

    public Integer getPreStockNum() {
        return preStockNum;
    }

    public void setPreStockNum(Integer preStockNum) {
        this.preStockNum = preStockNum;
    }

    public Integer getWaitOutStockNum() {
        return waitOutStockNum;
    }

    public void setWaitOutStockNum(Integer waitOutStockNum) {
        this.waitOutStockNum = waitOutStockNum;
    }

    public Integer getDoneOutStockNum() {
        return doneOutStockNum;
    }

    public void setDoneOutStockNum(Integer doneOutStockNum) {
        this.doneOutStockNum = doneOutStockNum;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getSpecNum() {
        return specNum;
    }

    public void setSpecNum(Integer specNum) {
        this.specNum = specNum;
    }

    public String getSpecUnits() {
        return specUnits;
    }

    public void setSpecUnits(String specUnits) {
        this.specUnits = specUnits;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 加载库存对象-出库
     *
     * @param stockDO         库存对象
     * @param doneInStockNum  在库数量-加减数量
     * @param usedStockNum    可用数量-加减数量
     * @param preStockNum     预占数量-加减数量
     * @param waitOutStockNum 待出数量-加减数量
     * @param doneOutStockNum 已出数量-加减数量
     * @return
     */
    public static RetailStock setOutStockDO(RetailStock stockDO, Integer doneInStockNum,
                                            Integer usedStockNum, Integer preStockNum, Integer waitOutStockNum,
                                            Integer doneOutStockNum) {
        stockDO.setDoneInStockNum(doneInStockNum);
        stockDO.setUsedStockNum(usedStockNum);
        stockDO.setWaitInStockNum(null);
        stockDO.setPreStockNum(preStockNum);
        stockDO.setWaitOutStockNum(waitOutStockNum);
        stockDO.setDoneOutStockNum(doneOutStockNum);
        return stockDO;
    }

    /**
     * 加载库存对象-入库
     *
     * @param stockDO        库存对象
     * @param doneInStockNum 在库数量-加减数量
     * @param usedStockNum   可用数量-加减数量
     * @param waitInStockNum 待入数量-加减数量
     * @return
     */
    public static RetailStock setInStockDO(RetailStock stockDO, Integer doneInStockNum,
                                           Integer usedStockNum, Integer waitInStockNum) {
        stockDO.setDoneInStockNum(doneInStockNum);
        stockDO.setUsedStockNum(usedStockNum);
        stockDO.setWaitInStockNum(waitInStockNum);
        stockDO.setPreStockNum(null);
        stockDO.setWaitOutStockNum(null);
        stockDO.setDoneOutStockNum(null);
        return stockDO;
    }

}
