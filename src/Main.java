import com.company.Product;
import com.company.Smartphone;
import com.company.Laptop;
import com.company.Tablet;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static ArrayList<Product> productsList;
    public Main(){
        productsList = new ArrayList<>();
    }


    public static void main(String[] args) {
        new Main();
        Scanner input = new Scanner(System.in);
        int choice;
        boolean exit = false;
        // array of smartphones, tablets and laptops
        Smartphone[] smartphones = {
                new Smartphone("Mi12", 600, 100, "red"),
                new Smartphone("Iphone 16", 20000, 3, "silver")

        };
        Tablet [] tablets = {
                new Tablet("TabAs10",750,80,"big"),
                new Tablet("Ipad 15",10000,4,"small"),
        };
        Laptop [] laptops = {
                new Laptop("Macbook",50000,2,8),
                new Laptop("Lenovo",650,10,2),
        };
        // converting the all products' arrays to lists
        productsList.addAll(new ArrayList<>(Arrays.asList(smartphones)));
        productsList.addAll(new ArrayList<>(Arrays.asList(tablets)));
        productsList.addAll(new ArrayList<>(Arrays.asList(laptops)));
        while(true) {
            System.out.println("=========================Choose from the Menu=================");
            System.out.println("1- View all products");
            System.out.println("2- Add new product");
            System.out.println("3- Remove a product");
            System.out.println("4- Show low stock products");
            System.out.println("5- Show high price products");
            System.out.println("6- Sort the products");
            System.out.println("7- Exit");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    displayAllProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    String remove;
                    System.out.println("Enter name of product to remove");
                    remove=input.nextLine();
                    removeProduct(remove);
                    break;
                case 4:
                    showLowStock();
                    break;
                case 5:
                    highPriceProducts();
                    break;
                case 6:
                    sortProducts();
                    displayAllProducts();
                    break;
                case 7:
                    exit = true;

                    break;



            }
            if(exit){
                break;
            }
        }
        System.out.println("Thank you for using ,I will miss you");
    }

    public static void displayAllProducts(){
        for (Product product : productsList) {
            product.displayDetails();
        }
    }
    public static void addProduct(){
        byte choice;
        Product newProduct = null;
        Scanner input = new Scanner(System.in);
        System.out.println("choose the device from the list");
        System.out.println("1:Smartphone");
        System.out.println("2:Tablet");
        System.out.println("3:Laptop");
        choice = input.nextByte();
        input.nextLine();
        System.out.println("Enter The Name ");
        String name = input.nextLine();
        System.out.println("Enter the Price ");
        float price = input.nextFloat();
        System.out.println("Enter the Quantity ");
        int quantity = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the color ");
                String color = input.nextLine();
                newProduct = new Smartphone(name,price,quantity,color);
                break;
            case 2:
                System.out.println("Enter the type");
                String type = input.nextLine();
                newProduct = new Tablet(name,price,quantity,type);
                break;
            case 3:
                System.out.println("Enter the ram ");
                int ram = input.nextInt();
                input.nextLine();
                newProduct = new Laptop(name, price, quantity,ram);

                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        productsList.add(newProduct);
        System.out.println("The product with name  " + name + " is add successfully.");




    }

    public static void removeProduct(String name) {
        Iterator<Product> iterator = productsList.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equals(name)) {
                iterator.remove(); // Safely remove the product
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("No product found with name: " + name);
        } else {
            System.out.println("Product(s) with name '" + name + "' removed successfully.");
        }
    }

    public static void showLowStock(){
        int counter = 0;
        System.out.println("========================The lowstock products=======================");
        for(Product product:productsList){
            if(product.isLowStock()){
                counter++;
                product.displayDetails();
                System.out.println("___________________________________________________");
            }
        }
        System.out.println("The Number of Products low stock:"+counter);
        System.out.println("__________________________________________________________");
    }
    public static void highPriceProducts(){
        int count=0;
        for(Product product:productsList){
            if(product.isHighPrice()){
                System.out.println("Product : "+product.getName()+ " the price : "+ product.getPrice());
                count ++;
            }
        }
        System.out.println("The Number of high price products: "+count);
    }
    public static void sortProducts() {
        Scanner input = new Scanner(System.in);
        byte choice;
        System.out.println("Choose the sort type");
        System.out.println("1- Name");
        System.out.println("2- Price");
        choice = input.nextByte();
        input.nextLine();
        switch (choice) {
            case 1:
                productsList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
                break;
            case 2:
                productsList.sort((p1, p2) -> Float.compare(p1.getPrice(), p2.getPrice()));
                break;

        }


    }
}