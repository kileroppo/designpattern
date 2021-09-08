package com.example.demodespatter.designpattern.command.impl;

import com.example.demodespatter.designpattern.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("这里啥指令也没有");
    }
}
