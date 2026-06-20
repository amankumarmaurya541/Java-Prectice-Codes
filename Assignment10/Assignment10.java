package Assignment10;

public class Assignment10 {
    public static void main(String[] args) {
        Employee e = new Employee("Priyanshu Vishwakarma", 123245, 400000);
        Manager m = new Manager("Aman Kumar Maurya", 12322, 500000, "Engineering");
        e.printDetail();
        System.out.println("----------------------------------");
        m.PrintManagerDetail();
        System.out.println("----------------------------------");
        m.meeting();


    }
}
class Employee{
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    public String getname(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public void printDetail(){
        System.out.println("Name: " + getname());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + getSalary());
    }
    public void work(){
        System.out.println(name + "is working");
    }
}
class Manager extends Employee{
    String department;
    Manager(String name, int id, double salary, String department ){
        super(name, id, salary);
        this.department = department;
    }
    public void PrintManagerDetail(){
        super.printDetail();
        System.out.println("Department: " + department);
    }
    public void meeting(){
        System.out.println(getname() + " is conducting a meeting in " + department);
    }
}