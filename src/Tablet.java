package com.company;

public class Tablet extends Product{
    private String type;
    // constructors___________________________________________________________________
    public Tablet() {
    }
    public Tablet(String name ,float price, int quantity) {
        super(name, price, quantity);
    }
    public Tablet(String name,float price, int quantity,String type) {
        super(name, price, quantity);
        this.type = type;
    }
    // getter & setter_____________________________________________________________
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    // methods__________________________________________________________________________________
    @Override
    public float applyDiscount() {
        return getPrice()*(1-0.07f);
    }

    public void displayDetails() {
        System.out.println("============Tablet===========");
        System.out.println("The Name " + super.getName());
        System.out.println("The Quantity " + super.getQuantity());
        System.out.println("The Type " + getType());
        System.out.println("The Price before discount is " + super.getPrice());
        float discountPrice = applyDiscount();
        System.out.println("The Price after discount is " + discountPrice);
        if (isLowStock()) {
            System.out.println("Pay attention the product is low stock");
        }
        if (isHighPrice()) {
            System.out.println("The product is High price$$ ");
        }
        System.out.println();
    }
}
