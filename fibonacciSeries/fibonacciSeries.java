package fibonacciSeries;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the fibonacci Series");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        fibonacci(num);


    }
    public static void fibonacci(int num){
        if (num < 0 )return;
        System.out.print("0 ");
        if (num == 0 )return;
        System.out.print("1 ");
        int first = 0 , second = 1;
        while (first+second <= num){
            int third = first + second;
            System.out.print(" " + third );
            first = second;
            second = third;


        }



    }
}
