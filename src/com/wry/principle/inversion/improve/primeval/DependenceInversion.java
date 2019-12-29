package com.wry.principle.inversion;

public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello  world!";
    }
}

//Person接受信息的功能
//方式1完成
//好处：简单，容易实现
//问题 1.如果获取消息的对象是 微信，短信等，
//则新增类，同时新增方法
//解决思路：引入一个抽象接口 IReceiver 表示接收者，这样接口与person 发生依赖
//因为Email ,wechat属于接受者的范围，他们实现IReceiver接口
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
