package com.example.demodespatter.designpattern.command.impl;

import com.example.demodespatter.designpattern.command.Command;
import com.example.demodespatter.designpattern.command.product.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.offLight();
    }
}
