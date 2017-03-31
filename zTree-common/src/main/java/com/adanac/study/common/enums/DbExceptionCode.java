package com.adanac.study.common.enums;

/**
 * @author Jimmy Shan
 * @date 2016-09-03
 * @desc 异常枚举类
 */
public enum DbExceptionCode {

	// 系统异常 runtime exception
	UNKNOW_EXCEPTON("9999", "未知异常", "系统异常，请联系管理员查看错误信息。"), FUNCTION_IS_NOT_COMPLETE("9998", "功能尚未开放。", "该功能尚未开放，尽情等待。"),

	// 数据库操作异常
	DB_OPERATOR_EXPT("0001", "数据库操作发生异常", "数据库操作发生异常"), LEGAL_ACCESS_EXPT("0002", "IllegalAccessException",
			"非法访问异常，请检查对象类型是否合法。"), INVACTION_TARGET_EXPT("0003", "InvocationTargetException",
					"调用目标异常"), BD_UPDATE_EXPT("0004", "UpdateException", "更新数据出错"),

	SYS_WH_EMPTY("0005", "帐号对应仓库不存在!", "帐号对应仓库不存在!");

	private String code;

	private String desin;

	private String desout;

	private DbExceptionCode(String code, String desin, String desout) {
		this.code = code;
		this.desin = desin;
		this.desout = desout;
	}

	public String getCode() {
		return code;
	}

	public String getDesin() {
		return desin;
	}

	public String getDesout() {
		return desout;
	}

	public static DbExceptionCode getByCode(String code) {
		if (code != null && !"".equals(code.trim())) {
			for (DbExceptionCode mnum : values()) {
				if (mnum.getCode().equals(code)) {
					return mnum;
				}
			}
		}
		return null;
	}

	public static String getInMsg(String code) {
		if (code != null && !"".equals(code.trim())) {
			for (DbExceptionCode mnum : values()) {
				if (mnum.getCode().equals(code)) {
					return mnum.getDesin();
				}
			}
		}
		return null;
	}

	public static String getOutMsg(String code) {
		if (code != null && !"".equals(code.trim())) {
			for (DbExceptionCode mnum : values()) {
				if (mnum.getCode().equals(code)) {
					return mnum.getDesout();
				}
			}
		}
		return null;
	}

	/**
	 * 根据异常的枚举值返回提示给客户端的异常信息内容
	 * (Add by Daniel Kong)
	 *
	 * @param DbExceptionCode 异常的枚举值
	 * @return 提示给客户端的异常信息内容
	 */
	public static String getExceptionMsg(DbExceptionCode DbExceptionCode) {
		return ("[" + DbExceptionCode.getCode() + "]" + DbExceptionCode.getDesout());
	}
}
