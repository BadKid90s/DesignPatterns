package com.wry.patterns.responsibiltychain.type1;

/**
 * 抽象处理者
 */
public abstract class Approver {
    //维持下一个请求处理者
    protected Approver approver;
    //名字
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理请求的方法
     */
    protected abstract void processRequest(PurchaseRequest purchaseRequest);
}
