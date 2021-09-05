package com.example.demodespatter.designpattern.Observe;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubjectImpls implements Subject {


  public static final List<Observer> observe =  new ArrayList();

    @Override
    public void updateObersver() {
        observe.parallelStream().forEach(
                ob ->{ob.update("我作为主题 给观察这得消息");} );
    }

    @Override
    public void addObeserve(Observer observer) {
        observe.add(observer);
    }

    @Override
    public void delObeserve(Observer observer) {
        observe.remove(observer);
    }
}
