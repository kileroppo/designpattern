package com.example.demodespatter.designpattern.factory.simplefactdemo.store;


import com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs.IBrothel;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs.AbsWhore;
import com.example.demodespatter.designpattern.factory.simplefactdemo.women.WhoreFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.constant.WSytleConstantdd;

public class FirstBorthel implements IBrothel {

    public static AbsWhore absWhore =null;

    public static WhoreFactory whoreFactory=null;


    public FirstBorthel(WhoreFactory whoreFactory){
        FirstBorthel.whoreFactory = whoreFactory;
    }

//     WhoreFactory whoreFactory = new WhoreFactory();

    @Override
    public String makeOrder(String style){

        whoreFactory.orderWhore(WSytleConstantdd.BIG_tits.getStyle());

        return "预约成功:";
    }

    @Override
    public String startService(){
        if (absWhore ==null) {
//            System.out.println("亲 您还未预约哦");
            return "亲 您还未预约哦 请先预约";
        }

//        absWhore.receiveGuest();
//
//        absWhore.oralSex();
//
//        absWhore.makeLove();

        return "服务成功 记得好评哦";

    }

    @Override
    public void submitOrder() {

    }

}
