package OOP;

public class Student {
    private int id;
    private String name;

    //------Constructor------------------
    //Default Constructor
    // public Student(){
    //     this.id = 1;
    //     this.name = "Hari";
    // }

    // Parameterized Constructor
    // If we have a another constructor then we have to initalize
    // the default constructor too as not all objects will be
    // initialized with values
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }


    //--------------------- SETTERS and GETTERS---------
    // Creating a setter that sets the value for id
    public void setID(int id){
        this.id = id;
    }
    // Creating a setter that gets the value of id.
    public int getID(){
        return this.id;
    }
     // Creating a setter that sets the value for id
     public void setName(String name){
        this.name= name;
    }
    // Creating a setter that gets the value of id.
    public String getName(){
        return this.name;
    }
}
