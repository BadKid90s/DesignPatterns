package com.wry.patterns.bridge.type3;

//BMP格式图像：扩充抽象类
public class BMPImage extends BridgeImage {
    public void parseFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        image.doPaint(m);
        System.out.println(fileName + "，格式为BMP。");
    }
}
