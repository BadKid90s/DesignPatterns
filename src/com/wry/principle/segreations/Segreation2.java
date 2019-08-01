package com.wry.principle.segreations;

public class Segreation2 {
    public static void main(String[] args) {
        A2 a=new A2();
        a.depend1(new B2());
        a.depend2(new B2());
        a.depend3(new B2());

        C2 c=new C2();
        c.depend1(new D2());
        c.depend4(new D2());
        c.depend5(new D2());
    }
}

interface Interface2_1 {
    void operation1();
}

interface Interface2_2 {
    void operation2();
}

interface Interface2_3 {
    void operation3();
}

interface Interface2_4 {
    void operation4();
}

interface Interface2_5 {
    void operation5();
}
class B2 implements Interface2_1,Interface2_2,Interface2_3 {
    @Override
    public void operation1() {
        System.out.println("B :1");
    }

    @Override
    public void operation2() {
        System.out.println("B :2");

    }

    @Override
    public void operation3() {
        System.out.println("B : 3");

    }


}

class D2 implements Interface2_1, Interface2_4,Interface2_5{
    @Override
    public void operation1() {
        System.out.println("D :1");
    }



    @Override
    public void operation4() {
        System.out.println("D: 4");

    }

    @Override
    public void operation5() {
        System.out.println("D: 5");

    }
}

//A类通过接口Interface1 依赖（使用）B类，但只使用1，2，3
class A2 {
    public void depend1(Interface2_1 i) {
        i.operation1();

    }
    public void depend2(Interface2_2 i) {
        i.operation2();

    }
    public void depend3(Interface2_3  i) {
        i.operation3();

    }
}

//C类通过接口Interface1 依赖（使用）D类，但只使用1，4，5
class C2 {
    public void depend1(Interface2_1 i) {
        i.operation1();

    }
    public void depend4(Interface2_4 i) {
        i.operation4();

    }
    public void depend5(Interface2_5 i) {
        i.operation5();

    }
}