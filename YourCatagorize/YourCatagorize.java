package YourCatagorize;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class YourCatagorize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, I define your catagorize");
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if (age >= 60) {
            System.out.println("You are a 'SENIOR'.");
        } else if (age >= 20) {
        System.out.println("You are a 'ADULT'.");
    } else if (age >=13) {
            System.out.println("You are a 'TEENAGER'.");
        } else if (age > 0 && age < 13) {
            System.out.println("You are a 'CHILD'.");
        } else {
            System.out.println("Default Age");
        }

    }
}
