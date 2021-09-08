package com.example.demodespatter.designpattern.chainRepos;

public class TestLogFilter {

    public static void main(String[] args) {

        // 日志等级大于过滤器中的等级则会记录日志
        AbsLoggerFilter loggerChain = getChainLog();

        // 1
//        loggerChain.wirteLog(AbsLoggerFilter.INFO, "This is an information.");

        // 2
//        loggerChain.wirteLog(AbsLoggerFilter.DEBUG,   "This is a debug level information.");
//        // 3
        loggerChain.wirteLog(AbsLoggerFilter.ERROR,   "This is an error information.");
    }

    private static AbsLoggerFilter getChainLog() {
        // 3
        ErrorLoggerFilter errorFilter = new ErrorLoggerFilter(AbsLoggerFilter.ERROR);

        DEBUGLoggerFilter debugFilter = new DEBUGLoggerFilter(AbsLoggerFilter.DEBUG);

        ConsloleLogger infoFilter = new ConsloleLogger(AbsLoggerFilter.INFO);

        errorFilter.setnextLogger(debugFilter);

        debugFilter.setnextLogger(infoFilter);

        return errorFilter;
    }
}
