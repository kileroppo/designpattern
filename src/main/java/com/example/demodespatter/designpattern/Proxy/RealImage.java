package com.example.demodespatter.designpattern.Proxy;

public class RealImage implements Image{

    String name;

    public RealImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("展示图片" + name);
    }
}
