package Tringle;

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your own calculator...");
        System.out.println("\n");
        System.out.print("Enter the value of Base: ");
        float b = input.nextFloat();

        System.out.print("Enter the value of height: ");
        float h = input.nextFloat();

        float Area = ( b * h ) / 2;

        System.out.print("Area Of A Triangle: " + Area);
    }
}