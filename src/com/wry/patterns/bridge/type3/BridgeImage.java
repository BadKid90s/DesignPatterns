package com.wry.patterns.bridge.type3;

/**
 * 抽象类 (桥接类)
 */
public abstract class BridgeImage {

    //以组合的形式关联图像
    protected Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract void parseFile(String fileName);
}
