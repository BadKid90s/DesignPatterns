package com.wry.principle.openclose.form;

public class WinForms {

    private AbstractButton button;

    public WinForms(AbstractButton button) {
        this.button = button;
    }

    public void display(){
        System.out.println("----------窗体---------");
        button.display();
        System.out.println("----------窗体---------");
    }

}
