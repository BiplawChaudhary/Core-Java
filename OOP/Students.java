package OOP;

// This is the student class that uses the address
public class Students {
    // Creating a object of Address type in Students class
    // this is HAS-A relationship
    private Address studentAddress;

    // Creating a getter and setters for the Address type
   
    public Address getAddress(){
        // Returns the Address
        return studentAddress;
    }
    // Setter for the address type
    public void setStudentAddress(Address studentAddress){
        // Sets the Students address for the student to the passed paramter
        this.studentAddress = studentAddress;
    }

   


    public static void main(String[] args) {
        // Creating an object for the student
        Students s1 = new Students();
        // As the student needs address creating a address object
        Address a1 = new Address();

        // Setting up the address
        a1.setCountryName("Japan");
        a1.setStateName("Jhapa");

        // As the student has a adrress, so setting the address for that student
        s1.setStudentAddress(a1);
        // Getting the address of that student
        System.out.println(s1.getAddress().getCountryName());


    }

}
