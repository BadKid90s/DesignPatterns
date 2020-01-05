package com.wry.patterns.builder.type4;

public class Client {
    public static void main(String[] args) {
        StringBuild2 build2 = new StringBuild2();
        build2.append("1-").append("2-").append("3");
        System.out.println(build2.toString());
    }
}
