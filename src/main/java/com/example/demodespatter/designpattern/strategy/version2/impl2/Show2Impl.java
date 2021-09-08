package com.example.demodespatter.designpattern.strategy.version2.impl2;

import com.example.demodespatter.designpattern.strategy.version2.Show2;

public class Show2Impl implements Show2 {
    @Override
    public String disPlayer() {
        System.out.println("this is show2 show");
        return "this is show2 show";
    }
}
