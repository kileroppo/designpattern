package com.example.demodespatter.designpattern.single;

public class SingleDemo {

    public static SingleDemo singleDemo =null;

    private SingleDemo() {

    }

    public SingleDemo getInstance(){
            if(singleDemo==null){
               synchronized (SingleDemo.class){
                   if (singleDemo == null) {
                       singleDemo = new SingleDemo();
                   }
            }
        }
        return singleDemo;
    }
}
