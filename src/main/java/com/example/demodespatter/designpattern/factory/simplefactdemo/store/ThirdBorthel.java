package com.example.demodespatter.designpattern.factory.simplefactdemo.store;

import com.example.demodespatter.designpattern.factory.simplefactdemo.constant.WSytleConstantdd;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl.AbsPersonFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl.BitisAbsWhoreFactory;

/**
 * Created by lizp on 2021-09-05.
 */
public class ThirdBorthel extends AbsBorthel{
	
	public static AbsWhore absWhore;
	
	public static AbsPersonFactory absPersonFactory;
	
//	PersonFactoryImpl  personFactory =	new PersonFactoryImpl();
	
	@Override
	protected AbsWhore createWhore(String style) {
		if (WSytleConstantdd.BIG_tits.getStyle().equals(style)) {
//			BitisAbsWhore bitisAbsWhore = new BitisAbsWhore(style);
//			ThirdBorthel.absWhore = bitisAbsWhore.enterWhore();
			
			 absPersonFactory = new BitisAbsWhoreFactory();
			 absWhore = absPersonFactory.makeWhoreInFatory(style);
		}
		return absWhore;
	}
}
