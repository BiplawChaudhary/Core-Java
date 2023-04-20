package OOP;

//implements keyword is used to inhert the interface
public class InterfaceImplement implements InterfaceClass {
//    Implementing the abstract methods in the interface in this class
    public void hello(){
        System.out.println("Hello hii");
    }
    public  void world(){
        System.out.println("I am interface implemented.");
    }

//    MAIN METHOD
    public static void main(String[] args) {
//        Creating the new object of the class
        InterfaceImplement obj1 = new InterfaceImplement();
//        calling the methods
        obj1.hello();
        obj1.world();
    }
}
