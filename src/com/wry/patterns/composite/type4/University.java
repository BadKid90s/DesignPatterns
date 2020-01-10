package com.wry.patterns.composite.type4;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {

    //存放的是学院
    private List<OrganizationComponent> list = new ArrayList<>();


    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent component) {
        list.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        list.remove(component);
    }

    @Override
    public void print() {
        System.out.println("***************" + getName() + "*************");
        for (OrganizationComponent organizationComponent : list) {
            organizationComponent.print();
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void setDesc(String desc) {
        super.setDesc(desc);
    }
}
