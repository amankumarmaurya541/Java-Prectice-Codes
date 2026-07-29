package Assignment40;

public class Assignment40 {
    public static void main(String[] args) {
        System.out.println("==== All Department ====");
        for (Department d : Department.values()){
            System.out.println(d);
        }
        System.out.println("\n==== isFullyStaffed() for HR ====");
        System.out.println("HR Fully staffed: " + Department.HR.isFullyStaffed(10));

        System.out.println("\n==== getRemainingSlots() for ENGINEERING ====");
        System.out.println("Engineering Remaining Slot: " + Department.ENGINEERING.getRemainingSlots(6));

        Employee e1 = new Employee("Aman", 213212, Department.HR);
        Employee e2 = new Employee("Priyanshu", 213144, Department.ENGINEERING);
        Employee e3 = new Employee("Anshu", 32112, Department.FINANCE);

        System.out.println("\n==== All Employees ====");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\n--- Department Ordinal and Name ---");
        System.out.println(e1.getName() + " --> dep: " + e1.getDepartment().name() + ", Ordinal: " + e1.getDepartment().ordinal());
        System.out.println(e2.getName() + " --> dep: " + e2.getDepartment().name() + ", Ordinal: " + e2.getDepartment().ordinal());
        System.out.println(e3.getName() + " --> dep: " + e3.getDepartment().name() + ", Ordinal: " + e3.getDepartment().ordinal());
    }
}
enum Department{
    HR("Human Resources", 15),
    ENGINEERING("Engineering", 10),
    MARKETING("Marketing", 20),
    FINANCE("Finance", 14),
    SALES("Sales", 16);

    private final String departmentName;
    private final int maxEmployees;

    Department(String departmentName, int maxEmployees){
        this.departmentName = departmentName;
        this.maxEmployees = maxEmployees;
    }

    public String getDepartmentName(){
        return departmentName;
    }
    public int getMaxEmployees(){
        return maxEmployees;
    }

    boolean isFullyStaffed(int currentEmployees){
        return currentEmployees >= maxEmployees;
    }
    int getRemainingSlots(int currentEmployees){
        return maxEmployees - currentEmployees;
    }

    @Override
    public String toString(){
        return ("Department Name: " + getDepartmentName() + ", Max Employees: " + getMaxEmployees());
    }
}
class Employee{
    private String name;
    private int employeeID;
    private Department department;

    Employee(String name, int employeeID, Department department){
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
    }

    String getName(){
        return name;
    }
    int getEmployeeID(){
        return employeeID;
    }
    Department getDepartment(){
        return department;
    }
    @Override
    public String toString(){
        return ("Employee Name: " + name + ", Id: " + employeeID + ", Department: " + department.name());
    }
}