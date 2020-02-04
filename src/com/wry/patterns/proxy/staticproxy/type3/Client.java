package com.wry.patterns.proxy.staticproxy.type3;

public class Client {
    public static void main(String[] args) {
        Searcher searcher=new ProxySearcher();
        searcher.DoSearch("杨过","玉女心经");
    }
}
