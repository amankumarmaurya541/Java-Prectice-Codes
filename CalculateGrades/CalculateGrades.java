package CalculateGrades;
import javax.xml.transform.Source;
import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade Calcuator");
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();
        
        if(marks >= 90 && marks <=100){
            System.out.println("Congratulation, Your grade is above 90%");
        } else if (marks >= 75 ) {
            System.out.println("Congratulation, Your grade is above 75%");
        } else if (marks >= 60 ) {
            System.out.println("Congratulation, Your grade is above 60%");
        } else if (marks >= 30 ) {
            System.out.println("Congratulation, Your grade is above 30%");
        } else if (marks >= 0 && marks < 30) {
            System.out.println("Sorry, Your grade is below 30%");
        } else {
            System.out.println("Default Marks");
        }
    }
}
