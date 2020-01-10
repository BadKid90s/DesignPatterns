package com.wry.patterns.composite.type4;


/**
 * @author Mi
 */
public class Client {
    public static void main(String[] args) {

        OrganizationComponent university = new University("XXXX大学", "XXXX大学，最牛的大学");

        OrganizationComponent college = new College("计算机学院", "程序猿的天堂");
        OrganizationComponent college2 = new College("社会学院", "美女的天堂");

        OrganizationComponent department=new Departmant("软件工程","软件工程不错");
        OrganizationComponent department2=new Departmant("网络工程","网络工程不错");
        OrganizationComponent department3=new Departmant("计算机科学与技术","计算机科学与技术不错");
        college.add(department);
        college.add(department2);
        college.add(department3);

        OrganizationComponent department10=new Departmant("心里学","心里学，不错");
        OrganizationComponent department11=new Departmant("幼师","幼师，不错");
        college2.add(department10);
        college2.add(department11);

        university.add(college);
        university.add(college2);

        university.print();
    }
}
