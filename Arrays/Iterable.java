package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
// IMporting the List
import java.util.List;
// Importing the set
import java.util.Set;
// importing the collections
import java.util.Collections;

// Collections does not have static index like arrays

public class Iterable {
    public static void main(String[] args) {

        // Creating an object of lists 
        // Read as List of String
        // Sytntax: List <DataType> varName = new ArrayList<>();
        // As it is a list can contain dublicate items
        List <String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("Mam");
        stringList.add("Apple");


        // There are various method in Collections class for a given Collection
        // Collections.methodName(VarName);
        Collections.sort(stringList);

        // printin the values
        for(String each : stringList){
            System.out.println(each);
        }


        // Creating a Set of Strings\
        // Set of string is a HashSet()

        System.out.println("\nSRING SET----");

          // Sytntax: Set <DataType> varName = new HashSet<>();
        // Cannot contaion Dublicate items
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Mine");
        stringSet.add("Hope");
        stringSet.add("Hope"); //This line will not be added to the Set

        for(String each : stringSet){
            System.out.println(each);
        }

        


    }




}
