package Assignments;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter Your " + (i + 1) + " Element: ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Your defined array is: ");
        i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }

        System.out.println("\n-------------------------------");
        i = 0;
        while (i < arr.length / 2){
           int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;

            i++;
        }
        System.out.println("Reversed Array: ");
        for ( i = 0; i < arr.length; i++ ){
            System.out.println(arr[i]);
        }

    }
}
