package com.wry.patterns.bridge.type3;

//PNG格式图像：扩充抽象类
public class PNGImage extends BridgeImage {
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        image.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
