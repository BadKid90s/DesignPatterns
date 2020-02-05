package com.wry.patterns.template.type2;

/**
 * 抽象豆浆类
 */
public abstract class Soyamilk {

    //模板方法可以定义final 防止子类覆盖
    public final void make() {
        select();
        if (coustomWantAddCondiments()) {
            add();
        }
        soak();
        beat();
    }

    //选择原材料
    private void select() {
        System.out.println("第一步，选择优质黄豆！");
    }

    //浸泡
    private void soak() {
        System.out.println("第三步，把黄豆和配料进行浸泡");
    }

    //打浆
    private void beat() {
        System.out.println("第四步，进行打磨");
    }

    //添加配料
    abstract void add();

    /**
     * 是否加入配料，模式返回true
     *
     * @return true OR false
     */
    public boolean coustomWantAddCondiments() {
        return true;
    }

}
