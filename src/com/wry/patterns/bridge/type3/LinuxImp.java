package com.wry.patterns.bridge.type3;
/**
 * Windows操作系统实现类：具体实现类
 */
public class LinuxImp implements Image {
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Linux操作系统中显示图像：");
    }
}
