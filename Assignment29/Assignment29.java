package Assignment29;

import java.util.Scanner;

public class Assignment29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age  = sc.nextInt();
        System.out.print("Enter class: ");
        int c = sc.nextInt();
        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();

        System.out.println("===============================");
        System.out.println("       Student Information       ");

        StudentInformation si = new StudentInformation();
        si.printInfo(name, age, c, percentage);
        si.grade(percentage);
        System.out.println("===============================");


    }
}
class StudentInformation{
    void printInfo(String name, int age, int c, int percentage){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + c);
        System.out.println("Percentage: " + percentage);
    }
    void grade(int percentage){
        if (percentage >= 90 && percentage <= 100){
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage <= 89) {
            System.out.println("Grade: B");
        } else if (percentage >= 50 && percentage <= 69) {
            System.out.println("Grade: C");
        }else {
            System.out.println("Grade: Fail");
        }
    }
}