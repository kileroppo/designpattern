package com.example.demofordesginpatter.designPattern.factory.simplefactDemo.store;

public interface IBrothel {

      /*
        *接口有问题  所以废弃  就是 每个店里这个三个步骤还要手动触发
        * 所以创建抽象类
       */

    //1 make order
    public String makeOrder(String style);

    // 2 start service
    public String startService();

    //3  submit order
    public void submitOrder();
}
