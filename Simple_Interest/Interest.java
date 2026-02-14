package Simple_Interest;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your own calculator...");
        System.out.println("\n");

        System.out.print("Enter the value of Persentage: ");
        float P = input.nextFloat();

        System.out.print("Enter the value of Rate: ");
        float R = input.nextFloat();

        System.out.print("Enter the value of Time: ");
        float T = input.nextFloat();

        float SI = ( P * R * T ) / 100;

        System.out.print("Simple interest is: " + SI);
    }
}