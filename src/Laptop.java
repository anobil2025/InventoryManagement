package com.company;

public class Laptop extends Product{

    private int ram;

    // constructors___________________________________________________________________
    public Laptop() {
    }
    public Laptop(String name, float price, int quantity) {
        super(name,price, quantity);
    }
    public Laptop(String name, float price, int quantity, int ram) {
        super(name, price, quantity);
        this.ram = ram;

    }
// getter & setter_____________________________________________________________
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    // methods__________________________________________________________________________________
    @Override
    public float applyDiscount() {
        return getPrice()*(1-0.1f);
    }

    public void displayDetails() {
        System.out.println("============Laptop===========");
        System.out.println("The name " + super.getName());
        System.out.println("The quantity " + super.getQuantity());
        System.out.println("The RAM " + getRam()+" GB");
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
