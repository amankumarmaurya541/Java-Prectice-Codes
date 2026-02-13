package Find_product;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your own Calculator...");
        System.out.print("Enter your First Number: ");
        float a = input.nextFloat();

        System.out.print("Enter your Second Number: ");
        float b = input.nextFloat();

        float Product = a * b;

        System.out.print("Product Of Two Number: " + Product);
    }
}