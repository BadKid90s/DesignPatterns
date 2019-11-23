package com.wry.principle.segreations.studentsmanage.primeval;

//实现类
class StuScoreList implements ManageInterface {
    StuScoreList() {
    }

    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }

    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }

    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }

    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }

    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }

    public void printStuInfo() {
    }

    public void queryStuInfo() {
    }
}
