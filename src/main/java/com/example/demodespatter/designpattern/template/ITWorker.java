package com.example.demodespatter.designpattern.template;

import java.util.Date;

public class ITWorker extends DemoTemplate{

    public ITWorker(String name){
        super(name);
    }

    @Override
    protected void work() {
        if(isPrintDate()){
            System.out.println(new Date().getTime());
        }
        System.out.println("写程序---修bug---提测");
    }

    @Override
    protected boolean isPrintDate(){
        return true;
    }

}
