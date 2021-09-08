package com.example.demodespatter.designpattern.Bradge;

import com.example.demodespatter.designpattern.Bradge.impl.Pig;

public class TestBradge {

    public static void main(String[] args) {
        CreatPig zhangsang = new CreatPig(new Pig(), "zhangsang");
        zhangsang.exec();

    }
}
