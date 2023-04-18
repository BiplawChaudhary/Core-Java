
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        

        //Declaration for reading input
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.printf("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.printf("Sum of %d and %d = %d", num1, num2, sum(num1, num2));
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }
}
