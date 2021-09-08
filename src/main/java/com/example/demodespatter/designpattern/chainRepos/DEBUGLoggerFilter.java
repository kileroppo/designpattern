package com.example.demodespatter.designpattern.chainRepos;

public class DEBUGLoggerFilter extends AbsLoggerFilter {


    public DEBUGLoggerFilter(int logLevel) {
        this.level = logLevel;
    }

    @Override
    void write(String message) {
        System.out.println("debug Console::Logger: " + message);
    }
}
