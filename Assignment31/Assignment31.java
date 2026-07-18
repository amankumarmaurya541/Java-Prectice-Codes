package Assignment31;

import java.util.Scanner;

public class Assignment31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Patient Registration System.");
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        System.out.print("Enter patient Weight: ");
        double weight = sc.nextDouble();
        System.out.print("Enter patient Height(in meter): ");
        double height = sc.nextDouble();

        PatientReport patientReport = new PatientReport(name, age,weight,height);
        System.out.println("=================== BMI result and Category ===================");
        patientReport.printBMIResultAndCategory();
        System.out.println("=================== Doctor Recommendation ===================");
        patientReport.printDoctorRecommendation();
        System.out.println("=================== Final Report ===================");
        patientReport.finalReport();

    }
}
class PatientReport{
    private String name;
    private int age;
    private double weight;
    private double height;

    PatientReport(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    double calculateBMI(){
        return weight / (height * height);
    }
    void printBMIResultAndCategory() {
        System.out.println("BMI result: " + calculateBMI());
        if (calculateBMI() < 18.5 && calculateBMI() > 0) {
            System.out.println("Category: Under Weight");
        } else if (calculateBMI() >= 18.5 && calculateBMI() <= 24.9) {
            System.out.println("Category: Normal Weight");
        } else if (calculateBMI() >= 25 && calculateBMI() <= 29.9) {
            System.out.println("Category: Over Weight");
        } else {
            System.out.println("Category: Obese");
        }
    }
    void printDoctorRecommendation(){
        if (age < 15 && age > 0){
            System.out.println("Recommended Doctor: Pediatrician");
        } else if (age >= 15 && age <= 60){
            System.out.println("Recommended Doctor: General Physician");
        }else {
            System.out.println("Recommended Doctor: Geriatric Specialist");
        }
    }
    void finalReport(){
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height + " m");
        System.out.print("BMI: ");
        printBMIResultAndCategory();
        printDoctorRecommendation();
    }
}
