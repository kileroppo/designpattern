package com.example.demofordesginpatter.designPattern.Observe;


import org.springframework.stereotype.Component;


@Component
public class ObserveImpl implements Observer {


    @Override
    public void update(String msg) {
        System.out.println("观察者：：收到消息"+ msg);
    }
}
