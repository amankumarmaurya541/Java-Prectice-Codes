package GreatestOfThree;
import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Greatest of three code");
        System.out.print("Enter the value of 'A': ");
        int A = input.nextInt();
        System.out.print("Enter the value of 'B': ");
        int B = input.nextInt();
        System.out.print("Enter the value of 'C': ");
        int C = input.nextInt();

        if(A>B && A>C){
            System.out.println("Greatest number is "+A);
        }else if (B>A && B >C) {
            System.out.println("Greatest number is "+B);
        }else {
            System.out.println("Greatest number is "+C);
        }

    }
}
