package Assignment37;

public class Assignment37 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditi", 234, "B.Tech", 85.5);
        Student s2 = new Student("Aditi", 234, "B.Tech", 85.5);
        Student s3 = new Student("Aman", 224, "M.Tech", 95.5);

        System.out.println("\n--- toString() ---");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\n--- equals() ---");
        System.out.println("p1.equals(p2): " + s1.equals(s2));
        System.out.println("P1.equals(p3): " + s1.equals(s3));

        System.out.println("\n--- hashCode ---");
        System.out.println("p1 hashCode: " + s1.hashCode());
        System.out.println("p2 hashCode: " + s2.hashCode());
        System.out.println("p3 hashCode: " + s3.hashCode());

        System.out.println("\n--- getClass() ---");
        System.out.println("p1 class: " + s1.getClass().getSimpleName());
        System.out.println("p2 class: " + s2.getClass().getSimpleName());
        System.out.println("p3 class: " + s3.getClass().getSimpleName());
    }
}
class Student{
    private String name;
    private int rollNumber;
    private String course;
    private double marks;

    Student(String name, int rollNumber, String course, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.marks = marks;
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
    double getMarks(){
        return marks;
    }

    @Override
    public String toString(){
        return("Name: " + getName() + ", Roll Number: " + getRollNumber() + ", Course: " + getCourse() + ", Marks: " + getMarks());
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return this.name.equals(other.name) && this.rollNumber == other.rollNumber;
    }
    @Override
    public int hashCode(){
        return (31 * rollNumber + name.hashCode());
    }
}