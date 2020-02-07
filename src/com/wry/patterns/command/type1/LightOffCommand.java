package com.wry.patterns.command.type1;

/**
 * 电灯 关命令 模式子类
 */
public class LightOffCommand implements Command {
    //聚合执行者电灯类
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}


