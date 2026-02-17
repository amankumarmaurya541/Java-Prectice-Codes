package OddOREven;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Odd Even Calculetor");
        System.out.print("Enter The Value Of Number: ");
        int Num = input.nextInt();

        if(Num % 2 == 0){
            System.out.println("Number Is Even");
        }else {
            System.out.println("Number Is Odd");

        }
    }
}
