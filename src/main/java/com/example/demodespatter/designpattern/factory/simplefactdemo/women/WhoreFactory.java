package com.example.demodespatter.designpattern.factory.simplefactdemo.women;

import com.example.demodespatter.designpattern.factory.simplefactdemo.constant.WSytleConstantdd;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs.AbsWhore;
import com.example.demodespatter.designpattern.factory.simplefactdemo.women.impl.BitisAbsWhore;
import com.example.demodespatter.designpattern.factory.simplefactdemo.women.impl.LolitaAbsWhore;
import com.example.demodespatter.designpattern.factory.simplefactdemo.women.impl.MercySisterAbsWhore;

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
