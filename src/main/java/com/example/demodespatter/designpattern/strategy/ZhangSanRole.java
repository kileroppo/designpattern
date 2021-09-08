package com.example.demodespatter.designpattern.strategy;

public class ZhangSanRole extends Role{

    @Override
    protected String show() {
        return "我是张三现在show一下";
    }

    @Override
    protected String attack() {
        return "对别人放了火魔法";
    }
}
