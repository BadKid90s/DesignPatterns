package com.wry.patterns.command.type1;

/**
 * 空命令
 * 没有任何命令，空执行，用于初始化每个按钮
 * 当调用空命令时，对象什么都不做，可以省掉对空的判断
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
