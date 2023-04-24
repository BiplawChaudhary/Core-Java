package Arrays;

import java.util.Arrays;

// Arrays have a predefined index so we cannot increase it's index more than it's set
public class ArrayFirst {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6};


        for(int each : values){
            if(each%2 == 0){
                System.out.println(each);
            }
        }

        // Import using java.util.Arrays
        // Arrays.MethodName(ArrayName);
        // The above Arrays method has different method for arrays

        Arrays.sort(values);
        
        for(int each : values){
           System.out.println(each);
        }
    }
}
