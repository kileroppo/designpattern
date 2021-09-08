package com.example.demodespatter.designpattern.command;

import com.example.demodespatter.designpattern.command.impl.NoCommand;


public class ControlPannel {

    public static final int  CONTROL_PANNEL_SIZE = 9;
    public static Command[] commands = new Command[CONTROL_PANNEL_SIZE];


    // 1 初始化
    public void initPannel(){
        for (int i = 0; i < CONTROL_PANNEL_SIZE; i++){
            commands[i] = new NoCommand();
        }
    }


    // 2 定制按钮
    public String setButtonFunc(int buttonIndex, Command command){
        if (buttonIndex >= 9) {
            return "不支持的按钮位数";
        }
        commands[buttonIndex] = command;
        return "设置成功";
    }

    // 3 发送指令
    public void sendCommand(int buttonIndex){
        if (buttonIndex >= 9){
            return;
        }
        commands[buttonIndex].execute();
    }


}
