package com.morning.star.enums;

/**
 * 公司
 * 
 * @author jiangyf
 */
public enum CompanyEnum {
	/**
	 * 欧亚到家
	 */
	DAOJIA("daojia", "欧亚到家"),
	/**
	 * 欧亚e购
	 */
	EGOU("egou", "欧亚e购"),
	/**
	 * 欧亚卖场
	 */
	MARKET("market", "欧亚卖场"),
	/**
	 * 欧亚新生活
	 */
	NEWLIFE("newlife", "欧亚新生活"),

	/**
	 * 鸿雁
	 */
	HONGYANG("HONGYANG","鸿雁"),

	TOHOME("ToHome","到家");


	private String code;
	private String desc;

	private CompanyEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static CompanyEnum getEnum(String code) {
		for (CompanyEnum value : values()) {
			if (value.getCode().equals(code)) {
				return value;
			}
		}
		return null;
	}

	/**
	 * 检查该公司是否只有一家门店（目前仅有欧亚到家只有一家门店）
	 * 
	 * @param companyCode
	 * @return
	 */
	public static boolean checkHasOneStore(String companyCode) {
		if (!DAOJIA.getCode().equals(companyCode)) {
			return true;
		}
		return false;
	}
}
