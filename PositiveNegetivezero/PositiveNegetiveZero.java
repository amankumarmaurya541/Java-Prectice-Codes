package PositiveNegetivezero;

import java.util.Scanner;

class PositiveNegetiveZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Value Of Number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Number Is Positive");
        } else if (num < 0) {
            System.out.println("Number Is Negative");
        }else{
            System.out.println("Number Is Zero");
        }
    }
}
