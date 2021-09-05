package com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce;

import com.example.demodespatter.designpattern.factory.simplefactdemo.store.AbsWhore;

/**
 *  工厂lei
 * @author create by killer 2021-09-05
 * @return
 */
public interface IPersonFactory   {


    /**
     *  interview
     * @author lizhipeng
     * @date 2021-09-05 9:33
     * @creed: Talk is cheap,show me the code
     * @return  String
     */
	 AbsWhore interview(AbsWhore absWhore);
	
	/**
	 *  train
	 * @author lizhipeng
	 * @date 2021-09-05 9:33
	 * @creed: Talk is cheap,show me the code
	 * @return  String
	 */
	AbsWhore train(AbsWhore absWhore);
}
