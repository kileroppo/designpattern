package com.example.demofordesginpatter.designPattern.factory.simplefactDemo.store;

import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.women.AbsWhore;

public abstract  class  AbsBorthel {


    public abstract AbsWhore  createWhore(String style);


      public void orderWhore(String style){
          AbsWhore absWhore = createWhore(style);
          absWhore.receiveGuest();
          absWhore.oralSex();
          absWhore.makeLove();
      }

}
