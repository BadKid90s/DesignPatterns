package com.wry.factory.abstractfactory.type3;

import com.wry.factory.abstractfactory.type3.factory.SkinFactory;
import com.wry.factory.abstractfactory.type3.product.Button;
import com.wry.factory.abstractfactory.type3.product.ComboBox;
import com.wry.factory.abstractfactory.type3.product.TextField;
import com.wry.utils.XMLUtil;


public class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XMLUtil.getBean(new Client(),"className");
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();



    }
}
