//Ek 'Employee' class banao jisme:
//- static variable 'count' ho jo track kare kitne employees bane
//- Har naya object banta hai toh count badhe
//- printCount() static method ho
//- 3 employees banao aur count print karo
package Assignment5;

public class Assignment5 {
    public static void main(String[] args) {
        Employee E1 = new Employee("Aman", 12325);
        Employee E2 = new Employee("Priyanshu", 13212);

        E1.printDetail();
        System.out.println("----------------------------------");
        E2.printDetail();

        Employee.printCount();

    }
}

class Employee{
    String name;
    int id;
    static int count = 0;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
        count++;
    }

    static void printCount(){
        System.out.println("Total Employee: " + count);
    }

    void printDetail(){
        System.out.println("Name: " + name + "\n" + "ID: " + id);
    }
}
