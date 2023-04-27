package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapImp {
    public static void main(String[] args) {
        //Map to store SID, NAME
        // Syntax: Map <keyDataType, ValueDataType> varName = new HashMap<>();
        Map <Integer, String> myMap = new HashMap<>();

        //Putting value in the Map
        //Syntax: objName.put(Key, Value);
        myMap.put(1, "Sabina");
        myMap.put(2, "Nabina");

        // Getting the value form the map
         //Syntax: objName.get(key);
        System.out.println(myMap.get(2));

        //Object data type can store data of any type. 
        Object myFirstObj = myMap.get(1);

        // Checking if the object is a string
        if(myFirstObj instanceof String){
            System.out.println("myFirstObj Is a String");
        }

    }
}
