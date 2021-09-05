package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit;

import com.example.demodespatter.designpattern.factory.simplefactdemo.constant.GeneralMsg;

/**
 * Created by lizp on 2021-09-05.
 */
public abstract class AbsConfigAuditInstitiution implements IAuditInstitiution{
	
	
	/**
	 *  组装流程
	 * @author create by killer 2021-09-05
	 * @return
	 */
	 public abstract IAuditInstitiution makePersonFactory();
	 
	 
	 @Override
	 public  String aduitFactory(){
		 IAuditInstitiution customPersonfactory = makePersonFactory();
		 /*
		   * 这里应该调用其它的filter
		   * 或者规则之类的来审核工厂
		   * 但我们暂时懒 先sout表示一下
		  */
		 System.out.println(GeneralMsg.CUSTOME_CREATE_FACTORY.getTxt()
								+ customPersonfactory);
		 return GeneralMsg.AUDIT_FACTORY_SUCCESS.getTxt();
	 }
	 
	 
	 
	 
	 
	   
	    
	   
	    
}
