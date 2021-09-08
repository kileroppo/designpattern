package com.example.demodespatter.designpattern.chainRepos;

public class ErrorLoggerFilter extends AbsLoggerFilter{

   public ErrorLoggerFilter(int logLevel){
        this.level = logLevel;
    }
    @Override
    void write(String message) {
        System.out.println("error log filter::"+ message);
    }
}
