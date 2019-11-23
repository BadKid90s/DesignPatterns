package com.wry.principle.openclose.form.remould;

import com.wry.principle.openclose.form.AbstractButton;
import com.wry.principle.openclose.form.CircleButton;
import com.wry.principle.openclose.form.RectangleButton;
import com.wry.principle.openclose.form.WinForms;

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
