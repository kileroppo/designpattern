package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl;


import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.IPersonFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.AbsConfigAuditInstitiution;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.DefaultAuditFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.IAuditInstitiution;

/**
 * Created by lizp on 2021-09-05.
 */
public class IPersonFactoryImpl extends AbsConfigAuditInstitiution implements IPersonFactory  {
	/**
	 * interview
	 * @return String
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 */
	@Override
	public String interview() {
		System.out.println("开始面试");
		return "面试成功";
	}
	
	/**
	 * train
	 * @return String
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 */
	@Override
	public void train() {
		System.out.println("开始 训练");
	}
	
	
	/**
	 * 组装流程
	 *
	 * @return
	 * @author create by killer 2021-09-05
	 */
	@Override
	public IAuditInstitiution makePersonFactory() {
		return new DefaultAuditFactory();
	}
}
