package com.wry.patterns.command.type2;

/**
 * 最小化命令类：具体命令类
 */
public class MinimizeCommand extends Command {
    //维持对请求接收者的引用
    private WindowHanlder whObj;

    public MinimizeCommand(WindowHanlder whObj) {
        this.whObj = whObj;
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        whObj.minimize();
    }
}