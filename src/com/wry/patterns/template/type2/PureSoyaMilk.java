package com.wry.patterns.template.type2;

/**
 * 纯豆浆，体现模板方法模式的钩子函数
 */
public class PureSoyaMilk extends Soyamilk {
    @Override
    void add() {
        //进行空实现
    }

    @Override
    public boolean coustomWantAddCondiments() {
        return false;
    }
}
