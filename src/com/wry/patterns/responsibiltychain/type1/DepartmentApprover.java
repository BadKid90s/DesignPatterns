package com.wry.patterns.responsibiltychain.type1;

/**
 * 系主任审批
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover( String name) {
        super(name);
    }

    @Override
    protected void processRequest(PurchaseRequest purchaseRequest) {
       if (purchaseRequest.getPrice()<=5000){
           System.out.println("请求编号ID："+purchaseRequest.getId()+"被"+this.name+"处理成功了！");
       }else{
           System.out.println(this.name+"无法处理，调用下级处理者，进行处理。");
           this.approver.processRequest(purchaseRequest);
       }
    }
}
