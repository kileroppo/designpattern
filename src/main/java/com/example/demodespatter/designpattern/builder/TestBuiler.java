package com.example.demodespatter.designpattern.builder;

import com.example.demodespatter.designpattern.builder.impl.FirstFactoryBuilder;

public class TestBuiler {

    public static void main(String[] args) {
        Director director = new Director();
        FirstFactoryBuilder fbder = new FirstFactoryBuilder("amd-3990x", "inter-3090ti");
        director.startProduct(fbder);

        Product product = fbder.getProduct();
        System.out.println("finally product:"+product);
    }
}
