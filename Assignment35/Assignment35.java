package Assignment35;

public class Assignment35 {
    public static void main(String[] args) {
        Person p1 = new Person("Aman", 18);
        Person p2 = new Person("Aman", 18);
        Person p3 = new Person("Anshu", 21);

        System.out.println("\n--- toString() ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n--- equals() ---");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));

        System.out.println("\n--- hashCode() ---");
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());

        System.out.println("\n--- getClass() ---");
        System.out.println("p1 class: " + p1.getClass().getName());
        System.out.println("p2 class: " + p2.getClass().getName());
        System.out.println("p3 class: " + p3.getClass().getName());
    }
}
class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return ("Name: " + name + "\nAge: " + age);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;

        return this.name.equals(person.name) && this.age == person.age;
    }
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }
}