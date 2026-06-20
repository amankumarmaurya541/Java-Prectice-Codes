package Assgnment9;
public class Assignment9 {
    public static void main(String[] args) {
        Dog d = new Dog("BOB", 26, "Bulldog");
        d.eat();
        System.out.println("---------------------------------");
        d.sleep();
        System.out.println("---------------------------------");
        d.bark();

    }
}
class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");

    }
}
class Dog extends Animal {
    String breed;

    Dog(String name, int age,String breed ){
        super(name, age);
        this.breed = breed;
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

}