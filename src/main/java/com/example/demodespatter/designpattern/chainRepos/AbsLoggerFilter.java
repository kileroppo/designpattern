package com.example.demodespatter.designpattern.chainRepos;

public abstract class AbsLoggerFilter {

    protected  int level;

    public static final int ERROR =3;

    public static final int DEBUG =2;

    public static final int INFO =1;

    protected AbsLoggerFilter absLoggerFilter;

    public void setnextLogger(AbsLoggerFilter nextLogger) {
        this.absLoggerFilter = nextLogger;
    }

    // combine log
    protected  void wirteLog(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(absLoggerFilter !=null){
            absLoggerFilter.wirteLog(level,message);
        }
    }

    // send next filter
     abstract void write(String message);

}
