package com.wry.patterns.bridge.type3;


//JPG格式图像：扩充抽象类
public class JPGImage extends BridgeImage {
    public void parseFile(String fileName) {
        //模拟解析JPG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        image.doPaint(m);
        System.out.println(fileName + "，格式为JPG。");
    }

}





