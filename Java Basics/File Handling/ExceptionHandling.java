

public class ExceptionHandling {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 0;

        // System.out.printf("%d / %d = %d", num1, num2, divide(num1, num2));
        try{
            System.out.printf("%d / %d = %d", num1, num2, divide(num1, num2));
        }
        catch(Exception err){
            //Printing the exception (Prints every details about the error)
            // err.printStackTrace();

            // Printing the only exception
            //This statement must be present if a method trows some exception
            System.out.println(err.getMessage());

            // Can also have own error message if we know what error is about to occur
            // System.out.println("Any Numbers Divide by Zero is INFINITY.");
        }
        finally{
            System.out.printf("Operation Completed.");
        }

    }

    // If a method throws an excettion then it's method name should have throws Expetion in it
    public static int divide(int num, int divisor) throws Exception{
        //Creating a custom exception
        if(divisor==0){
            throw new Exception("Any numbeer Divided by 0 is INFINITY.");
        }
        return num/divisor;
    }
}
