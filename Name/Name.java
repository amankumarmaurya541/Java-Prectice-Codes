package Name;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome "+name + " To BBD University.");
    }
}
