package com.wry.patterns.template.type1;

public class Client {
    public static void main(String[] args) {
        System.out.println("-----制作红豆豆浆------");
        Soyamilk soyamilk=new ReadBeanSoyaMilk();
        soyamilk.make();

        System.out.println("-----制作花生豆浆--------");
        soyamilk=new PeanutSoyaMilk();
        soyamilk.make();
    }
}
