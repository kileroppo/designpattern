package com.example.demofordesginpatter.designPattern.factory.simplefactDemo;

import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.constant.WSytleConstantdd;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women.AbsWhore;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women.BitisAbsWhore;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women.LolitaAbsWhore;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women.MercySisterAbsWhore;

public class WhoreFactory {

    public static AbsWhore absWhore;
    public AbsWhore orderWhore(String style){
        if (WSytleConstantdd.BIG_tits.getStyle().equals(style)) {
            absWhore = new BitisAbsWhore();
        }
        else if (WSytleConstantdd.LOLITA.getStyle().equals(style)) {
            absWhore = new LolitaAbsWhore();
        }
        else if (WSytleConstantdd.MERCY_SISTER.getStyle().equals(style)) {
            absWhore = new MercySisterAbsWhore();
        }else{
            // default bigtis
            absWhore = new BitisAbsWhore();
        }
        return absWhore;
    }
}
