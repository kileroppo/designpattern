package com.example.demodespatter.designpattern.Bradge;

public abstract  class Control {

   protected Birth birth ;

    public Control(Birth birth) {
        this.birth = birth;
    }

    protected abstract void exec();
}
