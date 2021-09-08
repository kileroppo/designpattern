package com.example.demodespatter.designpattern.chainRepos;

public class ConsloleLogger extends AbsLoggerFilter {


    public  ConsloleLogger(int logLevel) {
        this.level = logLevel;
    }

    @Override
    void write(String message) {
        System.out.println("Standard Console::Logger: " + message);

    }
}
