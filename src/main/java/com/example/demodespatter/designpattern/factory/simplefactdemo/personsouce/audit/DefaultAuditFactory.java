package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit;

/**
 * Created by lizp on 2021-09-05.
 */
public class DefaultAuditFactory extends AbsConfigAuditInstitiution{
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
