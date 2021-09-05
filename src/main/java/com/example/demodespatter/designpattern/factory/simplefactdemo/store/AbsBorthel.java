package com.example.demodespatter.designpattern.factory.simplefactdemo.store;

public abstract  class  AbsBorthel {


    /**
     *  具体每个点  你找工厂也好 自己早也好 我不管
     * @author create by killer 2021-09-05
     * @return
     */
    protected abstract AbsWhore createWhore(String style);

    
    /**
     *  让whore自动执行下面的步骤
     * @author create by killer 2021-09-05
     * @return
     */
      public AbsWhore orderWhore(String style){
          AbsWhore absWhore = createWhore(style);
          absWhore.receiveGuest();
          absWhore.oralSex();
          absWhore.makeLove();
          return  absWhore;
      }

}
