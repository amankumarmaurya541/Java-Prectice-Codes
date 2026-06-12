//Ek 'Calculator' class banao jisme:
//- add(), subtract(), multiply(), divide() methods hon
//- Constructor mein do numbers lo
//- Main method mein use karo
package Assignments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        System.out.println("Welcome to our Calculator.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Your First Number: ");
        int num2 = input.nextInt();

        Calculator C = new Calculator(num1, num2);

        C.add();
        C.sub();
        C.multi();
        C.devide();

    }
}

class Calculator{
    int firstNumber;
    int secondNumber;

    void add(){
        System.out.println("Addition Of Two Number: " + (firstNumber+secondNumber));
    }

    void sub(){
        System.out.println("Subtraction Of Two Number: " + (firstNumber-secondNumber));
    }
    void multi(){
        System.out.println("Multiplication Of Two Number: " + (firstNumber*secondNumber));
    }
    void devide(){
        System.out.println("Division Of Two Number: " + (firstNumber/secondNumber));
    }

    Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}