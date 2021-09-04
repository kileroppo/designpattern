package com.example.demofordesginpatter.designPattern.Observe;

public interface Subject {

    void updateObersver();

    void addObeserve(Observer observer);

    void delObeserve(Observer observer);


}
