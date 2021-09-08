package com.example.demodespatter.designpattern.decoreate.impl;

import com.example.demodespatter.designpattern.decoreate.IEquip;

public class Bloade implements IEquip {

    @Override
    public int attack() {
        System.out.println("大宝剑攻击");
        return 5;
    }

    @Override
    public String descript() {
        System.out.printf("描述");
        return "大宝剑";
    }

//    @Override
//    public String toString() {
//        return "Bloade{}";
//    }
}
