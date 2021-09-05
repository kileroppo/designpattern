package com.example.demodespatter.designpattern.factory.simplefactdemo.store.whoreimpl.impl;

import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.IPersonFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl.PersonFactoryImpl;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.AbsWhore;

public class BitisAbsWhore extends AbsWhore {
    
    IPersonFactory personFactory =new PersonFactoryImpl(style);
    
    public BitisAbsWhore(){
//        this.style = "big tits";
    }
    public BitisAbsWhore(String style){
        this.style = style;
    }
 
    
    @Override
    public String toString() {
        return "BitisAbsWhore{" +
                   "style='" + style + '\'' +
                   ", isTrain=" + isTrain +
                   '}';
    }
}
