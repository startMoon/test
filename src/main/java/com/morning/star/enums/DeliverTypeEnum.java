package com.morning.star.enums;

/**
 * 配送方式（1：送货上门；2：门店自提）
 * 
 * @author jiangyf
 * @date 2017年5月19日 下午4:25:58
 */
public enum DeliverTypeEnum {
	TO_HOME("1", "送货上门"), TO_STORE("2", "门店自提");

	private String code;
	private String desc;

	DeliverTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static DeliverTypeEnum getEnum(String code) {
		for (DeliverTypeEnum value : values()) {
			if (value.getCode().equals(code)) {
				return value;
			}
		}
		return null;
	}

}
