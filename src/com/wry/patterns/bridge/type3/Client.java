package com.wry.patterns.bridge.type3;

import com.wry.utils.XMLUtil;

public class Client {
    public static void main(String[] args) {

        //创建一种显示图片的系统
        Image image=new WindowsImp();
        //创建图片格式
        BridgeImage bridgeImage= new JPGImage();
        bridgeImage.setImage(image);
        bridgeImage.parseFile("小龙女");

        //使用配置文件
        //读取配置文件，反射生成对象
        image  = (Image) XMLUtil.getBean(new Client(), "imageSystemClassName");
        bridgeImage= (BridgeImage) XMLUtil.getBean(new Client(), "imageFormartClassName");
        bridgeImage.setImage(image);
        bridgeImage.parseFile("杨过");
    }
}
