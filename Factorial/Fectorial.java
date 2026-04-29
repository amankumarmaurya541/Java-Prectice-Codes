package Factorial;
import java.util.Scanner;
public class Fectorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculate factorial");
        System.out.print("Please, enter the number: ");
        int num = input.nextInt();
        long result = factoReturn(num);
        System.out.println("Factorial of the " + num + " is " + result);

    }

    public static long factoReturn(int num){
        if (num<2){
            return 1;
        }
       long fact = 1;

       int i = 2;
       while (i <= num){
           fact = fact * i;
           i++;
       }
       return fact;

    }
}
