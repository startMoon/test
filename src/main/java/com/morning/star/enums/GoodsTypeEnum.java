package com.morning.star.enums;

/**
 * 货品类型
 * 
 * @author jiangyf
 */
public enum GoodsTypeEnum {
	SP("SP", "单品"), PP("PP", "套装");

	private String code;
	private String desc;

	private GoodsTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GoodsTypeEnum getGoodsType(String code) {
		for (GoodsTypeEnum goodsTypeEnum : values()) {
			if (goodsTypeEnum.getCode().equals(code)) {
				return goodsTypeEnum;
			}
		}
		return null;
	}

}
