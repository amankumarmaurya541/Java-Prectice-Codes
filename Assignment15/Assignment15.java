package Assignment15;

public class Assignment15 {
    public static void main(String[] args) {
        Animal a;

        a =  new Dog("Puppy");
        a.sound();
        a.eat();
        System.out.println("---------------------------------------------");
        a = new Cat("Queenie");
        a.sound();
        a.eat();
        System.out.println("---------------------------------------------");
        a = new Cow("MooMoo");
        a.sound();
        a.eat();

    }
}
class Animal{
    private String name;

    Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void sound(){
        System.out.println(getName() + " makes some sound ");
    }
    public void eat(){
        System.out.println(getName() + " is eating");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    public void sound(){
        System.out.println(getName() + " says: Woof Woof");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    public void sound(){
        System.out.println(getName() + " says: Meow Meow");
    }
}
class Cow extends Animal{
    Cow(String name){
        super(name);
    }
    public void sound(){
        System.out.println(getName() + " says: Moo Moo");
    }
}
