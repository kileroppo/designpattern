package com.example.demodespatter.designpattern.factory.simplefactdemo.constant;

/**
 * Created by lizp on 2021-09-05.
 */
public enum GeneralMsg {
	
	/**
	 *  用于客户自定义创建工厂时返回信息说明
	 * @author create by killer 2021-09-05
	 * @return
	 */
	CUSTOME_CREATE_FACTORY(001,"收到客户自定义工厂"),
	/**
	 *  收到客户创建的自定义工厂审核通过信息
	 * @author create by killer 2021-09-05
	 * @return
	 */
	AUDIT_FACTORY_SUCCESS(002,"客户自定义工厂 审核通过"),
	/**
	 *  收到客户创建的自定义工厂审核失败信息
	 * @author create by killer 2021-09-05
	 * @return
	 */
	AUDIT__FACTORY_FAILD(003,"客户自定义工厂 审核失败");
	

	private int code;
	private String txt;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getTxt() {
		return txt;
	}
	
	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	GeneralMsg(int code, String txt) {
		
		this.code = code;
		this.txt = txt;
	}
}
