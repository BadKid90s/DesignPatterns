package com.wry.patterns.builder.type3;


import com.wry.utils.XMLUtil;

public class Client {
    public static void main(String[] args) {
        ActorBuilder builder = new DevilBuilder();
        ActorController controller = new ActorController();
        Actor actor = controller.construct(builder);
        System.out.println(actor.toString());

        System.out.println("--------------------使用配置文件获取---------------------");
        //读取配置文件中的参数
        builder = (ActorBuilder) XMLUtil.getBean(new Client(), "className");
        actor = controller.construct(builder);
        System.out.println(actor.toString());
    }
}
