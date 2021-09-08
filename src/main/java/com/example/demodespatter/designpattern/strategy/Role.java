package com.example.demodespatter.designpattern.strategy;

public abstract class Role {

    /**
     *  基于抽象方法优点：可以每个角色
     *  个性化定制
     *  缺点 ：不能复用相同的 比如2个两同的人 都会火魔法
     *  每创建一个对象  就要写一遍相同的代码
     *  不能复用
      */
    public static String  name = null;

    protected  abstract String show();

    protected  abstract String attack();


}
