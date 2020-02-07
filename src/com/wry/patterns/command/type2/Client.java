package com.wry.patterns.command.type2;

public class Client {
    public static void main(String[] args) {
        //创建帮助处理对象
        HelpHandler helpHandler=new HelpHandler();
        //创建帮助命令对象
        Command command=new HelpCommand(helpHandler);
        //与调用者进行关联
        FunctionButton helpButton=new FunctionButton("帮助");
        helpButton.setCommand(command);

        //创建帮助处理对象
        WindowHanlder windowHanlder=new WindowHanlder();
        //创建帮助命令对象
        Command minimizeCommand=new MinimizeCommand(windowHanlder);
        //与调用者进行关联
        FunctionButton miniButton=new FunctionButton("最小化");
        miniButton.setCommand(minimizeCommand);

        //按钮与窗口显示类整合
        FBSettingWindow fbSettingWindow=new FBSettingWindow("测试命令模式");
        fbSettingWindow.addFunctionButton(helpButton);
        fbSettingWindow.addFunctionButton(miniButton);
        fbSettingWindow.display();

        helpButton.onClick();
        miniButton.onClick();

    }
}
