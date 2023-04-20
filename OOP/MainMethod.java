//Classes are the blueprint of objects. 
package OOP;

//If classes are in same package(folder) then
// There is no need to import
public class MainMethod{
    public static void main(String[] args){

        // Calling the Parameterized Constructor
        Student s1 = new Student(1, "Jimmy");

        // Calling the setter and setting values
        // s1.setID(1);
        // s1.setName("Hank Pym");

        // Calling to getters to get the values
        System.out.printf("The ID is %d.", s1.getID());
        System.out.printf("The name is %s.", s1.getName());
    }
}
