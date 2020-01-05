package com.wry.patterns.builder.type4;


/**
 * 既充当指挥者，有充当产品 ，继承具体建造者，调用具体建造者的构建方法，返回自己类型
 */
public class StringBuild2 extends StringBuilderImpl {

    public StringBuild2 append(String str){
        super.append(str);
        return this;
    }

    @Override
    public String toString() {
        return super.string;
    }

}
