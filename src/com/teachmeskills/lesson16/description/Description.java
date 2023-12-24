package com.teachmeskills.lesson16.description;

public class Description {

    private int price;
    private String descriptionOrder;

    public Description(int price, String descriptionOrder) {
        this.price = price;
        this.descriptionOrder = descriptionOrder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescriptionOrder() {
        return descriptionOrder;
    }

    public void setDescriptionOrder(String descriptionOrder) {
        this.descriptionOrder = descriptionOrder;
    }

    @Override
    public String toString() {
        return "Description{" +
                "price=" + price +
                ", descriptionOrder='" + descriptionOrder + '\'' +
                '}';
    }

}
