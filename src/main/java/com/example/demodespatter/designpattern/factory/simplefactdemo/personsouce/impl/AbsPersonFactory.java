package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl;

import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.IPersonFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.AbsWhore;

/**
 * Created by lizp on 2021-09-05.
 */
public abstract class AbsPersonFactory implements IPersonFactory {
	
	public abstract AbsWhore makeWhoreInFatory(String sytle);
	
	
	
	
	
	
}
