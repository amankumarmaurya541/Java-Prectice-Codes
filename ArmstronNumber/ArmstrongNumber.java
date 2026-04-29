package ArmstronNumber;

import java.util.Scanner;

 class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Checker");
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        if (isArmstrong(num)){

            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }

    public static int countDigit(int num){
       if(num==0){
           return 1;
       }

        int digit =0;
        while(num>0){

            num=num/10;
            digit++;
        }
        return digit;
    }
    public static boolean isArmstrong(int num){

        int numCopy=num;
        int result=0;

        while(numCopy>0){
            int Lastdigit=0;

            Lastdigit=numCopy%10;

            result= result  +  (int) Math.pow(Lastdigit,countDigit(num));

            numCopy=numCopy/10;
        }
        if (num==result){

            return true;
        }
else {
        return false;}
    }
}
