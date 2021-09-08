package com.example.demodespatter.designpattern.builder;

public class Director {

    AbsBuilder absBuilder;

    public void startProduct(AbsBuilder absBuilder){
        absBuilder.setproductPropeis1();
        absBuilder.setproductPropeis2();
        absBuilder.setproductPropeis3();
    }
}
