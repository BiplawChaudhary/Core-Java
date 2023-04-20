package OOP;
//Abstract class have an abstract keyword
//They are implemented in inheriting object
//Objects of abstract class cannot be created
public abstract class AbstractClass {
//    Abstract method which is implemented in inheriting method
    public abstract void printMethod();

    //An abstract class can have non abstract methods too
    public void nonAbstractClass(){
        System.out.println("I am non abstract clas.");
    }
}
