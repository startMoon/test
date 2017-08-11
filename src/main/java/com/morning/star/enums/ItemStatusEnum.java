package com.morning.star.enums;

/**
 * 商品状态
 * 
 * @author jiangyf
 */
public enum ItemStatusEnum {
	/**
	 * 上架
	 */
	OFFSALE(0, "下架"),
	/**
	 * 下架
	 */
	ONSALE(1, "上架");

	private Integer code;
	private String desc;

	private ItemStatusEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public Integer getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static ItemStatusEnum getGoodsType(String code) {
		for (ItemStatusEnum itemStatusEnum : values()) {
			if (itemStatusEnum.getCode().equals(code)) {
				return itemStatusEnum;
			}
		}
		return null;
	}
}
