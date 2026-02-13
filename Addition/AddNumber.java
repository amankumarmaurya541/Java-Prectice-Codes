
package Addition;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter your second number: ");
        int secondNum = input.nextInt();

        int Sum = firstNum + secondNum;

        System.out.println("Sum of two number: "+ Sum);
    }
}
