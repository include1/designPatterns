package com.zm.design.command;

public class Client {
    public static void main(String[] args) {
        System.out.println("命令模式的一个demo");
        //定义一个接受者
        LightReceiver lightReceiver = new LightReceiver();
        //定义开、关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //定义一个遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setControllerCommand(0,lightOnCommand,lightOffCommand);
        remoteController.pushOnButton(0);
       // remoteController.pushOffButton(0);
        remoteController.reset();
    }
}
