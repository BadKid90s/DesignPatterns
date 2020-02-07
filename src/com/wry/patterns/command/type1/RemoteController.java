package com.wry.patterns.command.type1;

/**
 * 遥控器
 */
public class RemoteController {
    //按钮命令集合
    private Command[] onCommands;
    private Command[] offCommands;
    //执行撤销命令
    private Command undoCommand;

    /**
     * 构造器完成对按钮的初始化
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置需要的命令
     */
    public void setCommand(int number, Command onCommand, Command offCommand) {
        offCommands[number] = offCommand;
        onCommands[number] = onCommand;
    }

    /**
     * 按开按钮
     */
    public void onButtonWasPushed(int number) {
        //找到你按下开的按钮，并调用按钮的命令方法
        onCommands[number].execute();
        //记录这次的操纵，用于撤销
        undoCommand = onCommands[number];
    }

    /**
     * 按关按钮
     */
    public void offButtonWasPushed(int number) {
        //找到你按下关的按钮，并调用按钮的命令方法
        offCommands[number].execute();
        //记录这次的操纵，用于撤销
        undoCommand = offCommands[number];
    }

    /**
     * 撤销方法
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
