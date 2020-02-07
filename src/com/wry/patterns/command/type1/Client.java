package com.wry.patterns.command.type1;

public class Client {
    public static void main(String[] args) {
        //创建电灯对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //创建遥控器
        RemoteController remoteController=new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        //按下灯的开关按钮
        System.out.println("-----按下灯的开按钮--------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----按下灯的关按钮--------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----执行撤销操作----------");
        remoteController.undoButtonWasPushed();
    }
}
