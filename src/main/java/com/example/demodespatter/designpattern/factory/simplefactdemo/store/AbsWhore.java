package com.example.demodespatter.designpattern.factory.simplefactdemo.store;

/**
 * AbsWhore
 *
 * @blame Android Team
 */
public abstract class AbsWhore {


    public String style;
    
    public boolean isTrain;
//    protected  String style = null;
    
//    public abstract  AbsWhore enterWhore( );

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
