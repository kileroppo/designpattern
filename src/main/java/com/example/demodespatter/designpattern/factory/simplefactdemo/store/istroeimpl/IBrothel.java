package com.example.demodespatter.designpattern.factory.simplefactdemo.store.istroeimpl;

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
     * @return string
     */
    public String startService();

    /**
     *
     *  submit order
     * @author lizhipeng
     * @date 2021-09-05 9:24
     * @return void
     */
     
    public void submitOrder();
}
