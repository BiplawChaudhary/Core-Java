package OOP.Practice;

public class InheritanceApp {
    public static void main(String[] args) {
        // Creating an object of produts
        Product p1 = new Product(101,"watcch", 1000);
        // p1 is not an object. Its a reference variable which holds he hashcode of the object in hexadecimal notation
        // System.out.println("Product is: "+ p1);

        // Setting up the values

        p1.showProductDetails();

    }
}
