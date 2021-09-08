package com.example.demodespatter.designpattern.strategy.version2.impl2;

import com.example.demodespatter.designpattern.strategy.version2.Attack2;

public class Attack2Impl implements Attack2 {
    @Override
    public String attack() {
        System.out.println("this is attack attack");
        return "this is attack2 impl attack";
    }
}
