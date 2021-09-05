package com.example.demodespatter.designpattern.factory.simplefactdemo.constant;


public enum WSytleConstantdd {


    BIG_tits("big tits"),
    MERCY_SISTER("mercy sister"),
    LOLITA("lolita"),
    DEFAULT("default");

     WSytleConstantdd(String style) {
        this.style = style;
    }

    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
