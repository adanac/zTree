package com.adanac.study.common.exception;


import com.adanac.study.common.enums.DbExceptionCode;

/**
 * @author Jimmy Shan
 * @date 2016-09-03
 * @desc 集成异常基类
 */
public class DbException extends Exception {

	private static final long serialVersionUID = 3239257809614865978L;

	private String code;

	public String getOutMsg() {
		DbExceptionCode mcode = DbExceptionCode.getByCode(code);
		if (mcode != null) {
			return mcode.getDesout();
		}
		return getMessage();
	}

	public String getInMsg() {
		DbExceptionCode mcode = DbExceptionCode.getByCode(code);
		if (mcode != null) {
			return mcode.getDesin();
		}
		return getMessage();
	}

	public DbException() {
		super();
	}

	public DbException(Throwable e) {
		super(e);
	}

	public DbException(String errorCode) {
		super();
		this.code = errorCode;
	}

	public DbException(DbExceptionCode mcode, Throwable e) {
		super(mcode.getDesin(), e);
		this.code = mcode.getCode();
	}

	public DbException(String code, Throwable e) {
		super(DbExceptionCode.getInMsg(code), e);
		this.code = code;
	}

	public DbException(String code, String message) {
		super(message);
		this.code = code;
	}

	public DbException(DbExceptionCode exceptionCode) {
		super(exceptionCode.getDesout());
		this.code = exceptionCode.getCode();
	}

	public DbException(String code, String message, Throwable e) {
		super(message, e);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
