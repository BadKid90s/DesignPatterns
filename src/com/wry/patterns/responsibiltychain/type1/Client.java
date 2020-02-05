package com.wry.patterns.responsibiltychain.type1;

public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest request = new PurchaseRequest(1, 40000, 1);

        //创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("王教导主任");
        ViceSchoolApprover viceSchoolApprover = new ViceSchoolApprover("李副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("钱校长");
        //设置下一个请求处理者（构成环状）
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolApprover);
        viceSchoolApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);
        //处理请求
        departmentApprover.processRequest(request);
    }
}
