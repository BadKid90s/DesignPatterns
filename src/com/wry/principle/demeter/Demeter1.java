package com.wry.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {

    public static void main(String[] args) {

        SchoolManage manage=new SchoolManage();
        manage.printAllEmployee(new CollegeManager());
    }

}

//学校总部的员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院的管理类
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工的ID=" + i);
            list.add(employee);
        }
        return list;
    }
}
//直接朋友
//Employee、CollegeManager
//陌生朋友
//CollegeEmployee
class SchoolManage {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校员工的ID=" + i);
            list.add(employee);
        }
        return list;
    }

    public void printAllEmployee(CollegeManager manager) {
        List<CollegeEmployee> allEmployee = manager.getAllEmployee();
        for (CollegeEmployee employee : allEmployee) {
            System.out.println("学院员工" + employee.getId());
        }

        List<Employee> allEmployee2 = this.getAllEmployee();
        for (CollegeEmployee employee2 : allEmployee) {
            System.out.println("学校员工" + employee2.getId());
        }
    }
}