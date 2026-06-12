//Ek 'Student' class banao jisme:
//- name, age, marks (fields)
//- Constructor se values assign karo
//- printDetails() method banao jo sab print kare
//- Main method mein 2 student objects banao
package Assignments;

public class Assignment2 {
    public static void main(String[] args) {
        Student S1 = new Student("Aman", 18 , 23);
        Student S2 = new Student("Shubham", 5 , 95);
        Student S3 = new Student("EndRealms", 56 , 78);

        System.out.println("First Student: ");
        System.out.println(S1.name);
        System.out.println(S1.age);
        System.out.println(S1.marks);

        System.out.println("----------------------------------------------------");

        System.out.println("Second Student: ");
        System.out.println(S2.name);
        System.out.println(S2.age);
        System.out.println(S2.marks);

        System.out.println("----------------------------------------------------");

        System.out.println("Third Student: ");
        System.out.println(S3.name);
        System.out.println(S3.age);
        System.out.println(S3.marks);

    }

}

class Student{
    String name;
    int age;
    int marks;


    void print(){
        System.out.println("Name = " + name + "\n" + "Age = " + age + "\n" + "marks = " + marks);
    }

    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
