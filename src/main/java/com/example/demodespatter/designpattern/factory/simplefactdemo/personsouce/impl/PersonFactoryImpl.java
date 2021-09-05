package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl;


import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.IPersonFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.AbsConfigAuditInstitiution;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.DefaultAuditFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.IAuditInstitiution;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.AbsWhore;

/**
 * Created by lizp on 2021-09-05.
 */
public class PersonFactoryImpl extends AbsConfigAuditInstitiution implements IPersonFactory  {
	
	private  String style;
	/**
	 *  create whore
	 * @author create by killer 2021-09-05
	 * @return
	 */
	public PersonFactoryImpl(String style){
		this.style = style;
	}
	
	/**
	 * interview
	 * @return String
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 */
	@Override
	public AbsWhore interview(AbsWhore absWhore) {
		System.out.println("开始面试");
		return absWhore;
	}
	
	/**
	 * train
	 * @return String
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 */
	@Override
	public AbsWhore train(AbsWhore absWhore) {
		System.out.println("开始 训练");
		absWhore.style = style +"trained";
		return absWhore;
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
