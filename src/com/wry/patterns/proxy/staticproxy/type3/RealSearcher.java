package com.wry.patterns.proxy.staticproxy.type3;

public class RealSearcher implements Searcher {
    //模拟查询商务信息
    @Override
    public String DoSearch(String userId, String keyword) {
        System.out.println("用户" + userId + "使用关键词" + keyword + "查询信息！");
        return "返回具体内容";
    }
}