package com.example.demodespatter.designpattern.Bradge;

public class CreatPig extends Control{

    String name;

    public CreatPig(Birth birth, String name) {
        super(birth);
        this.name = name;
    }

    @Override
    protected void exec() {
        birth.birth(name);
    }
}
