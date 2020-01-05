package com.wry.practise.springmvc;

public class Client {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.doDispatch(new HttpRequestController());
        dispatcherServlet.doDispatch(new SimpleController());
    }
}
