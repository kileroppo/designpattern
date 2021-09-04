package com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women;

public abstract class AbsWhore {


    public String style;
//    protected  String style = null;



    //1 receive the guest
    public void receiveGuest(){
        System.out.println("start receive the guest.....");
        System.out.println("finish receive the guest  ");
    }

    // 2 oral sex
    public void oralSex(){
        System.out.println("start oral sex...");
        System.out.println("finish oral sex ");
    }

    // 3 make love
    public void makeLove(){
        System.out.println("start make love....");
        System.out.println("finish make love");
        submitOder();
    }

    // 4 submit oreder
    public void submitOder(){
        System.out.printf("submit order");
    }
}
