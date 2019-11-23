package com.wry.principle.openclose.form.remould;


public class Client {
    public static void main(String[] args) {

        AbstractButton button;
        WinForms forms;
        //显示圆角按钮
        button=new CircleButton();
        forms=new WinForms(button);
        forms.display();
        //显示矩形扁平按钮
        button=new RectangleButton();
        forms=new WinForms(button);
        forms.display();
    }
}
