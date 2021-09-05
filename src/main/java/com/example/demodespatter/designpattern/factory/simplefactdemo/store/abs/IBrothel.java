package com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs;

public interface IBrothel {

      /*
        *接口有问题  所以废弃  就是 每个店里这个三个步骤还要手动触发
        * 所以创建抽象类
       */

   
    /**
     *  make order
     */
    public String makeOrder(String style);

    /**
     *
     *  start service
     * @author lizhipeng
     * @date 2021-09-05 9:23
     * @param null
     * @creed: Talk is cheap,show me the code
     * @return string
     */
    public String startService();

    /**
     *
     *  submit order
     * @author lizhipeng
     * @date 2021-09-05 9:24
     * @param null
     * @creed: Talk is cheap,show me the code
     * @return void
     */
     
    public void submitOrder();
}
