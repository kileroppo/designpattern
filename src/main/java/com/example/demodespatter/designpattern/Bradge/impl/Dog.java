package com.example.demodespatter.designpattern.Bradge.impl;

import com.example.demodespatter.designpattern.Bradge.Birth;

public class Dog implements Birth {
    @Override
    public void birth(String name) {
        System.out.println(name + "you are birth dog");
    }
}
