package OOP;
//If non-abstract class inherits abstract class, then all methods must be implemented
//Extends inherits the class
public class AbstractImplemented extends AbstractClass{
//    Implementing the abstract method in this inherited class
    public void printMethod(){
        System.out.println("Hello World");
    }

//    The main
    public static void main(String[] args) {
//        Creating a new object of the inherited class
        AbstractImplemented e1 = new AbstractImplemented();
//        calling the abstract and non-abstract methods
        e1.printMethod();
        e1.nonAbstractClass();
}}
