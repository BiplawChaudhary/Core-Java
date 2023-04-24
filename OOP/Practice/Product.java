package OOP.Practice;
// Whatever we write in a class is in the actual property of object as we're describing the object
// Non-Static types do no belong to the class they belong to the objecct
// If you want anything that should belong to the class make it static`
public class Product{
    // Attributes (state)
    private int pid;
    private String name;
    private int price;

    //Default Constructor
    public Product(){
    }

    public Product(int pid, String name, int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    // Methods (behavior)

    // Getter
    public void showProductDetails(){
        System.out.println("------Product ID:"+ this.pid+"------");
        System.out.printf("Name:%s\tPrice:%d", this.name, this.price);
        System.out.println("-------------------------------");
    }

} 