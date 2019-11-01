package com.wry.composite.type2;

/**
 * 安全模式是把树枝节点和树叶节点彻底分开，
 * 树枝节点单独拥有用来组合的方法，这种方法比较安全。
 * 但由于不够透明，所以树叶节点和树枝节点将不具有相同的接口，客户端的调用需要做相应的判断，带来了不便。
 * 相比透明模式就少了add()和romove()抽象方法的声明。
 */
public abstract class Component {
    
    protected String name;
    
    public Component(String name) {
        this.name = name;
    }

    //获取分支下的所有叶子构件和树枝构件
    public abstract void display(int depth);
    
}