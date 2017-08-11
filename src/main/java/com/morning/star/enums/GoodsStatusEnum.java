package com.morning.star.enums;

/**
 * 货品流通状态，1：退市 2：上市 3：禁售
 * 
 * @author jiangyf
 */
public enum GoodsStatusEnum {
	OFF_MARKET(1, "退市"), ON_MARKET(2, "上市"), FORBID_SALE(3, "禁售");

	private Integer code;
	private String desc;

	private GoodsStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static GoodsStatusEnum getEnum(Integer code) {
		for (GoodsStatusEnum value : values()) {
			if (value.getCode().equals(code)) {
				return value;
			}
		}
		return null;
	}
}
