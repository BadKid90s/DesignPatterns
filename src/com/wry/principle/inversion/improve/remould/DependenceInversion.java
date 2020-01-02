package com.wry.principle.inversion.improve;

public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}

//定义接口
interface IReceiver {
    String getInfo();
}


class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：hello  world!";
    }
}

class Wechat implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息：hello  world!";
    }
}

//Person接受信息的功能
//方式2完成

class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
