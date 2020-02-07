package com.wry.patterns.command.type2;

/**
 * 帮助命令类：具体命令类
 */
public class HelpCommand extends Command {
    //维持对请求接收者的引用
    private HelpHandler hhObj;

    public HelpCommand(HelpHandler hhObj) {
        this.hhObj = hhObj;
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        hhObj.display();
    }
}