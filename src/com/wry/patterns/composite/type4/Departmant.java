package com.wry.patterns.composite.type4;

public class Departmant extends OrganizationComponent {
    public Departmant(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
