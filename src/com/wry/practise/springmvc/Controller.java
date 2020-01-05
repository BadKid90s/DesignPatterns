package com.wry.practise.springmvc;

public interface Controller {
    void doGet();

    void doPost();
}

class FunctionController implements Controller {

    @Override
    public void doGet() {
        System.out.println("function......");
    }

    @Override
    public void doPost() {
        this.doGet();
    }
}

class HttpRequestController implements Controller {


    @Override
    public void doGet() {
        System.out.println("http.....");
    }

    @Override
    public void doPost() {
        doGet();
    }
}

class SimpleController implements Controller {


    @Override
    public void doGet() {
        System.out.println("simple......");
    }

    @Override
    public void doPost() {
        doGet();
    }
}

