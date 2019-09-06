package com.wry.proxy.staticproxy;

/**
 * 被代理的对象的类，实现ITearcherDao接口
 */
public class TearcherDaoImpl implements ITearcherDao {
    @Override
    public void tearch() {
        System.out.println("正在教书··········");
    }
}
