package com.wry.composite.type1;

/**
 * 组合模式之透明模式
 * 透明模式是把组合使用的方法放到抽象类中，不管叶子对象还是树枝对象都有相同的结构，
 * 这样做的好处就是叶子节点和树枝节点对于外界没有区别，它们具备完全一致的行为接口。
 * 但因为Leaf类本身不具备add()、remove()方法的功能，所以实现它是没有意义的。
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //增加一个叶子构件或树枝构件
    public abstract void add(Component component);

    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);

    //获取分支下的所有叶子构件和树枝构件
    public abstract void display(int depth);

}