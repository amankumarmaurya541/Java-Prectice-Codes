package Assignment26;

public class Assignment26 {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            void sound() {
                System.out.println("Dog says: Woof Woof!");
            }
        };
        Animal cat = new Animal() {
            @Override
            void sound() {
                System.out.println("Cat says: Meow Meow!");
            }
        };

        Animal cow = new Animal() {
            @Override
            void sound() {
                System.out.println("Cow says: Moo Moo!");
            }
        };
        dog.sound();
        cat.sound();
        cow.sound();
        System.out.println("-------------------------");
        dog.eat();
    }
}
abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Animal is eating");
    }
}
