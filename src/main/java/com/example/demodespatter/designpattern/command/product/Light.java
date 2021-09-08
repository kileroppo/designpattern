package com.example.demodespatter.designpattern.command.product;

public class Light implements Product{

    @Override
    public void func() {
        System.out.println("我是灯 具有开和关的功能");
    }

    public void onLight(){
        System.out.println("开灯");
    };
    public void offLight(){
        System.out.println("关灯");
    };



}
