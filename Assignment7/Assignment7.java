package Assignment7;

public class Assignment7 {
    public static void main(String[] args) {
        Student s1 = new Student("Priyanshu Vishwakarma", 1232419342, 95);
        Student s2 = new Student("Aman kumar Maurya", 1225035419, 101);

        s1.printReport();
        System.out.println("---------------------------------");
        s2.printReport();
    }
}
class Student{
    private String name;
    private int rollNumber;
    private int marks;

    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public int getMarks(){
        return marks;
    }

    public void setMarks(){
        if(marks<=100){
            this.marks = marks;
        }else{
            System.out.println("Invalid Marks!");
        }
    }

    public void grade(){
        if (marks > 100){
            System.out.println("Invalid Marks");
        }
        else if(marks <= 100 && marks >= 90 ) {
            System.out.println("Congratulation :), Your Grade is: A");
        }else if (marks <= 89 && marks >= 70) {
            System.out.println("Congratulation :), Your Grade is: B");
        } else if (marks <= 69 && marks >= 50) {
            System.out.println("Congratulation :), Your Grade is: C");
        }else {
            System.out.println("Sorry! You Are Fail :(");
        }
    }
    public void printReport(){
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Marks: " + getMarks());
        grade();
    }
}
