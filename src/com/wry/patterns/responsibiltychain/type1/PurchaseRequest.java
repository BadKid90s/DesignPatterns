package com.wry.patterns.responsibiltychain.type1;

/**
 * 请求类
 */
public class PurchaseRequest {
    //类型
    private int type=0;
    //价格
    private float price=0.0f;
    //ID
    private int id=0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
