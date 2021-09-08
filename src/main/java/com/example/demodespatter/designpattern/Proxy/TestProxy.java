package com.example.demodespatter.designpattern.Proxy;

public class TestProxy {

    public static void main(String[] args) {
        ProxyRealImage testProxy = new ProxyRealImage("--我是测试");
        testProxy.display();
    }
}
