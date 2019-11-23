package com.wry.principle.segreations.inter.primeval;

public class Segreation1 {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
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

    @Override
    public void operation4() {
        System.out.println("B: 4");

    }

    @Override
    public void operation5() {
        System.out.println("B:  5");


    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D :1");
    }

    @Override
    public void operation2() {
        System.out.println("D :2");

    }

    @Override
    public void operation3() {
        System.out.println("D : 3");

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
class A {
    public void depend1(Interface1 i) {
        i.operation1();

    }
    public void depend2(Interface1 i) {
        i.operation2();

    }
    public void depend3(Interface1 i) {
        i.operation3();

    }
}
//C类通过接口Interface1 依赖（使用）D类，但只使用1，4，5
class C {
    public void depend1(Interface1 i) {
        i.operation1();

    }
    public void depend4(Interface1 i) {
        i.operation4();

    }
    public void depend5(Interface1 i) {
        i.operation5();

    }
}