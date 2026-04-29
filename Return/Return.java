package Return;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int a = readNum();
        int b = readNum();

        int result = sum(a, b);
        System.out.println("Sum of two number is " + result);



    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Please, Enter your Number: ");
        int num = input.nextInt();
        return num;
    }

    }



