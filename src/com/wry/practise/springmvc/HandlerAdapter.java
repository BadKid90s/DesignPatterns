package com.wry.practise.springmvc;

public interface HandlerAdapter {
    boolean supports(Object handler);

    void handle(Object handler);
}

class HandleFanctionrAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof FunctionController);
    }

    @Override
    public void handle(Object handler) {
        ((FunctionController) handler).doGet();
    }
}

class HttpRequestHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return ( handler instanceof HttpRequestController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpRequestController) handler).doGet();
    }
}

class SimpleServletHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return ( handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doGet();
    }


}


