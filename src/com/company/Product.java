package com.company;

public abstract class Product implements Discountable {
    private String name;
    private float price = 0.0f;
    private int quantity =0;
    // constructors___________________________________
        //Default
    public Product(){

    }
        //customized
    public Product(String name,float price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //setters:----------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Getters:-------------------------------------
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //methods
        // displayDetails
    public abstract void displayDetails();
        //checking lowStock
    public boolean isLowStock(){
        return quantity < 5 ;
    }
        //checking highPrice
    public boolean isHighPrice(){
        return price > 1000;
    }
}
