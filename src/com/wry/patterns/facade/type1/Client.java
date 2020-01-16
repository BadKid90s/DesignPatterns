package com.wry.patterns.facade.type1;

public class Client {
    public static void main(String[] args) {
        HomeTheateFacade facade = new HomeTheateFacade();
        facade.ready();
        facade.play();
        facade.end();
    }

}
