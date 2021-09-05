package com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs;

import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.audit.DefaultAuditFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.impl.IPersonFactoryImpl;

public abstract  class  AbsBorthel {


    protected abstract AbsWhore  createWhore(String style);


    
    public static final DefaultAuditFactory defactory = new DefaultAuditFactory();
    
      public AbsWhore orderWhore(String style){
          AbsWhore absWhore = createWhore(style);
          /*
            这用的默认审核机构创建的工厂
            如果不想用 自己extends抽象机构
            自己去自定义机构 创建工厂
           */
          absWhore.interViewAndTranin(new IPersonFactoryImpl());
          absWhore.receiveGuest();
          absWhore.oralSex();
          absWhore.makeLove();
          return  absWhore;
      }

}
