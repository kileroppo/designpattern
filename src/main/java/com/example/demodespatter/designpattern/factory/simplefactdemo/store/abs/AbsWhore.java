package com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs;

import com.example.demodespatter.designpattern.factory.simplefactdemo.personsouce.IPersonFactory;

/**
 * AbsWhore
 *
 * @blame Android Team
 */
public abstract class AbsWhore {


    public String style;
//    protected  String style = null;

 
    /**
     *  interViewAndTranin
     * @author lizhipeng
     * @date 2021-09-05 9:44
     * @param
     * @return void
     */
    protected void interViewAndTranin(IPersonFactory personFactory){
        personFactory.interview();
        personFactory.train();
        System.out.println("使用官方推荐机构进行的面试和训练！！！");
    }

    /**
     *
     *  receive the guest
     * @author lizhipeng
     * @date 2021-09-05 9:29
     */
    protected void receiveGuest(){
        System.out.println("start receive the guest.....");
        System.out.println("finish receive the guest  ");
    }
    
    /**
     *
     *  oralSex
     * @author lizhipeng
     * @date 2021-09-05 9:29
     */
    protected void oralSex(){
        System.out.println("start oral sex...");
        System.out.println("finish oral sex ");
    }
    
    /**
     *
     *  makeLove
     * @author lizhipeng
     * @date 2021-09-05 9:29
     */
    protected void makeLove(){
        System.out.println("start make love....");
        System.out.println("finish make love");
        submitOder();
    }
    
    /**
     *
     *  submitOder
     * @author lizhipeng
     * @date 2021-09-05 9:29
     */
    public void submitOder(){
        System.out.print("submit order");
    }
}
