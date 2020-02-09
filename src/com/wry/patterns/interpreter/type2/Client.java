package com.wry.patterns.interpreter.type2;

public class Client {
    public static void main(String[] args) {
        Context context=new Context();
        context.assign("a",10);
        context.assign("b",20);
        context.assign("c",30);

        InstructionHandler instructionHandler=new InstructionHandler("a+c-a");
        instructionHandler.handle(context);
        instructionHandler.output();
    }
}
