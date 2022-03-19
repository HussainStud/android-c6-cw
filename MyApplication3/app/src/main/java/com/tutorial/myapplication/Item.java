package com.tutorial.myapplication;

public class Item {
    private String itemName;
    private Double itemPrice;
    private int itemImg;

    public Item(String itemName, Double itemPrice, int itemImg) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }
}
