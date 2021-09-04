package com.example.demofordesginpatter.designPattern.factory.simplefactDemo.store;


import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women.AbsWhore;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.WhoreFactory;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.constant.WSytleConstantdd;

public class FirstBorthel implements IBrothel {

    public static AbsWhore absWhore =null;

    public static WhoreFactory whoreFactory=null;


    public FirstBorthel(WhoreFactory whoreFactory){
        this.whoreFactory = whoreFactory;
    }

//     WhoreFactory whoreFactory = new WhoreFactory();

    @Override
    public String makeOrder(String style){

        whoreFactory.orderWhore(WSytleConstantdd.BIG_tits.getStyle());

        return "预约成功:"+ absWhore.style;
    }

    @Override
    public String startService(){
        if (absWhore ==null) {
//            System.out.println("亲 您还未预约哦");
            return "亲 您还未预约哦 请先预约";
        }

        absWhore.receiveGuest();

        absWhore.oralSex();

        absWhore.makeLove();

        return "服务成功 记得好评哦";

    }

    @Override
    public void submitOrder() {

    }

}
