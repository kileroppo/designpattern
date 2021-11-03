package com.example.demodespatter.testFanX.impl;

import com.example.demodespatter.testFanX.Animal;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年10月09日 14:32
 */
@Slf4j
public class Cat<T> implements Animal {

    public T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public void eat() {
    System.out.println("i am cat!!!");
    }

}
