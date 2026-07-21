package Assignment34;

public class Assignment34 {
    public static void main(String[] args) {
        int[] marks = {87, 98, 94, 89, 92};
        Student s1 = new Student("Aman",234, "BTech", marks );
        s1.printStudentReport();
        System.out.println();
        System.out.println("==========Verifying Immutability==========");
        marks[0] = 99;
        s1.printStudentReport();
        System.out.println("==========Immutability Verified===========");

    }
}
class Student{
    private final String name;
    private final int rollNumber;
    private final String course;
    private final int[] marks;

    Student(String name, int rollNumber, String course, int[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++ ){
            this.marks[i] = marks[i];
        }
    }
    String getName(){
        return name;
    }
    int getRollNumber(){
        return rollNumber;
    }
    String getCourse(){
        return course;
    }
    int[] getMarks(){
        int[] copy = new int[marks.length];
        for (int i = 0; i < marks.length; i++){
            copy[i] = marks[i];
        }
        return copy;
    }
    int getTotalMarks(){
        int total = 0;
        for (int i = 0; i < marks.length; i++){
           total += marks[i];
        }
        return total;
    }
    double getAverage(){
        return (double) getTotalMarks()/marks.length;
    }
    int getHighestMark(){
        int highest = 0;
        for (int i = 0; i < marks.length; i++){
            if (highest < marks[i]){
                highest = marks[i];
            }
        }
        return highest;
    }
    void printStudentReport(){
        System.out.println("==========STUDENT REPORT==========");
        System.out.println("Name       : " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Course     : " + getCourse());
        System.out.print("Marks        : ");
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("Total Marks  : " + getTotalMarks());
        System.out.println("Highest Marks: " + getHighestMark());
        System.out.println("Average Marks: " + getAverage());
        System.out.println("==================================");
    }
}