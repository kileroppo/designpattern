package com.example.demodespatter.designpattern.Proxy.autoproxy;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年11月03日 11:40
 */
public class Person implements ISay {

    @Override
    public void sayHello() {
        System.out.println("person say");
    }
}
