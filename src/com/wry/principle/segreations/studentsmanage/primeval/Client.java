package com.wry.principle.segreations.studentsmanage.primeval;

public class Client {
    public static void main(String[] args) {
        StuScoreList scoreList=new StuScoreList();
        scoreList.insert();
        scoreList.queryStuInfo();
    }
}
