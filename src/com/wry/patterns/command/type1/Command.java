package com.wry.patterns.command.type1;

/**
 * 命令接口
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
