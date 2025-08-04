package com.company;

public class Smartphone extends Product{

    private String color;
    // constructors___________________________________________________________________
    public Smartphone() {
    }
    public Smartphone(String name,float price, int quantity) {
        super(name, price, quantity);
    }
    public Smartphone(String name ,float price, int quantity,String color) {
        super(name,price, quantity);
        this.color = color;
    }
// getter & setter_____________________________________________________________
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // methods__________________________________________________________________________________
    @Override
    public float applyDiscount() {
        return getPrice()*(1-0.05f);
    }

    public void displayDetails(){
        System.out.println("============Smartphone===========");
        System.out.println("The name " + super.getName() );
        System.out.println("The quantity "+super.getQuantity());
        System.out.println("The color "+getColor());
        System.out.println("The Price before discount is "+ super.getPrice());
        float discountPrice = applyDiscount();
        System.out.println("The Price after discount is "+ discountPrice);
        if (isLowStock()) {
            System.out.println("Pay attention the product is low stock");
        }
        if (isHighPrice()) {
            System.out.println("The product is High price$$ ");
        }
        System.out.println();

    }

}
