package com.example.demodespatter.designpattern.command;

import com.example.demodespatter.designpattern.command.impl.LightOffCommand;
import com.example.demodespatter.designpattern.command.impl.LightOnCommand;
import com.example.demodespatter.designpattern.command.product.Light;

public class testControlPannel {

    public static void main(String[] args) {
        ControlPannel controlPannel = new ControlPannel();
        controlPannel.initPannel();


        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);


        controlPannel.setButtonFunc(1,lightOnCommand);
        controlPannel.setButtonFunc(0,lightOffCommand);

        controlPannel.sendCommand(1);
        controlPannel.sendCommand(0);
        controlPannel.sendCommand(3);
        controlPannel.sendCommand(10);

    }
}
