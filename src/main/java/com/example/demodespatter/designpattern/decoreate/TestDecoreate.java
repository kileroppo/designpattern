package com.example.demodespatter.designpattern.decoreate;

import com.example.demodespatter.designpattern.decoreate.impl.Bloade;
import com.example.demodespatter.designpattern.decoreate.impl.YellowGemEuqip;

public class TestDecoreate {

    public static void main(String[] args) {
        IEquip yellowGemEuqip = new YellowGemEuqip(new Bloade());
        System.out.println("当前设备："+ yellowGemEuqip.attack()+"--"+ yellowGemEuqip.descript());
    }
}
