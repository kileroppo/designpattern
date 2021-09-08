package com.example.demodespatter.designpattern.decoreate.impl;

import com.example.demodespatter.designpattern.decoreate.DecoreateEquip;
import com.example.demodespatter.designpattern.decoreate.IEquip;

public class YellowGemEuqip implements DecoreateEquip {


    IEquip equip;

    public YellowGemEuqip(IEquip equip){
        this.equip = equip;
    }

    @Override
    public int attack() {
        return   10 + equip.attack();
    }

    @Override
    public String descript() {
        return  "黄宝石"+ equip.descript();
    }

    @Override
    public String toString() {
        return "YellowGemEuqip{" +
                "equip=" + equip +
                '}';
    }
}
