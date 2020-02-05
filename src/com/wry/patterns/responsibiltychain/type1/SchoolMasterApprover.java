package com.wry.patterns.responsibiltychain.type1;

/**
 * 校长审批
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    protected void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println("请求编号ID：" + purchaseRequest.getId() + "被" + this.name + "处理成功了！");
        } else {
            System.out.println(this.name+"无法处理，调用下级处理者，进行处理。");
            this.approver.processRequest(purchaseRequest);
        }
    }
}


