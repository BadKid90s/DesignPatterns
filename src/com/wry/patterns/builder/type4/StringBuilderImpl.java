package com.wry.patterns.builder.type4;

/**
 * 具体的建造者，实现抽象建造者    返回具体的建造者对象
 */
public class StringBuilderImpl implements AbcBuilder {
    protected String string="";
    @Override
    public AbcBuilder append(String str) {
        string+=str;
        return this;
    }
}
