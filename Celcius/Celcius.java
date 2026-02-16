package Celcius;

import java.util.Scanner;

class Celcius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your own calculator...");
        System.out.println("\n");

        System.out.print("Enter the value of Fahrenheit: ");
        float F = input.nextFloat();

        float C = (F - 32) * 5 / 9;

        System.out.print("Celcius value is: " + C);
    }
}