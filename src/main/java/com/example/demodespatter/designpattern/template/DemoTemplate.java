package com.example.demodespatter.designpattern.template;

public abstract  class DemoTemplate {

    protected String name;

    public DemoTemplate(String name) {
        this.name = name;
    }

    protected  void workDay(){
        enterComprot();
        openComput();
        work();
        offComput();
        exitComprot();
    }

    /**
     * work for everyone
     */
    protected abstract  void work();

    /**
     * 打开电脑
     */
    protected void openComput(){
        System.out.println( name + "打开电脑");
    }



    /**
     * 关闭电脑
     */
    protected void offComput(){
        System.out.println( name + "关闭电脑");
    }




    /**
     * 进入公司
     */
    protected void enterComprot(){
        System.out.println( name + "进入公司");
    }




    /**
     * 退出公司
     */
    protected void exitComprot(){
        System.out.println( name + "退出公司");
    }

    protected boolean isPrintDate(){
        return false;
    }

}
