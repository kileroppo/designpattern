package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl;

import com.example.demodespatter.designpattern.factory.simplefactdemo.store.AbsWhore;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.whoreimpl.impl.BitisAbsWhore;

/**
 * Created by lizp on 2021-09-05.
 */
public class BitisAbsWhoreFactory extends AbsPersonFactory{
	
	
	@Override
	public AbsWhore makeWhoreInFatory(String sytle) {
		BitisAbsWhore bitisAbsWhore = new BitisAbsWhore();
		
		interview(bitisAbsWhore);
		
		train(bitisAbsWhore);
		
		return bitisAbsWhore;
	}
	
	/**
	 * interview
	 *
	 * @param absWhore
	 * @return String
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 */
	@Override
	public AbsWhore interview(AbsWhore absWhore) {
		System.out.println("开始面试：" + absWhore.toString());
		absWhore.isTrain = true;
		System.out.println("结束面试：" + absWhore.toString());
		return absWhore;
	}
	
	/**
	 * train
	 *
	 * @param absWhore
	 * @return String
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 */
	@Override
	public AbsWhore train(AbsWhore absWhore) {
		System.out.println("开始训练：" + absWhore.toString());
		absWhore.style = "big tits";
		System.out.println("结束训练：" + absWhore.toString());
		return absWhore;
	}
}
