package com.example.demodespatter.designpattern.strategy.version2;

import com.example.demodespatter.designpattern.strategy.version2.impl2.Attack2Impl;
import com.example.demodespatter.designpattern.strategy.version2.impl2.Show2Impl;

public class DemoRole2 {

    public static void main(String[] args) {
        ZhangSanRole2 zhang_san_role2 = new ZhangSanRole2("zhang san role2");
        zhang_san_role2.setShow2(new Show2Impl())
                .setAttack2(new Attack2Impl());
        zhang_san_role2.useAttack2();
        zhang_san_role2.ueShow2();
    }
}
