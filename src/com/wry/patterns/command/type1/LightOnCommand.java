package com.wry.patterns.command.type1;

/**
 * 电灯 开命令 模式子类
 */
public class LightOnCommand implements Command {
    //聚合执行者电灯类
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
