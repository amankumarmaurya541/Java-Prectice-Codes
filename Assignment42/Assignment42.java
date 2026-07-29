package Assignment42;

public class Assignment42 {
    public static void main(String[] args) {
        GameCharacter g = new GameCharacter("Steve", 20);
        System.out.println("==== Abstract Method ====");
        g.move("East");
        g.attack("Sword");
        g.heal(10);
        System.out.println("\n==== Default Method ====");
        g.stop();
        g.defend();
        g.checkHealth();
        System.out.println("\n==== Static Method ====");
        Movable.movementInfo();
        Attackable.attackInfo();

    }
}
interface Movable{
    void move(String direction);
    default void stop(){
        System.out.println("Character stopped moving");
    }
    static void movementInfo(){
        System.out.println("Movable Interface — handles movement");
    }
}
interface Attackable{
    void attack(String weapon);
    default void defend(){
        System.out.println("Character is defending");
    }
    static void attackInfo(){
        System.out.println("Attackable Interface — handles attack");
    }
}
interface Healable{
    void heal(int amount);
    default void checkHealth(){
        System.out.println("Checking health status...");
    }
}
class GameCharacter implements Movable, Attackable, Healable{
    private String name;
    private int health;

    GameCharacter(String name, int health){
        this.name = name;
        this.health = health;
    }
    public void move(String direction){
        System.out.println(name + " moved towards " + direction);
    }
    public void attack(String weapon){
        System.out.println(name + " attacked with " + weapon);
    }
    public void heal(int amount){
        health += amount;
        System.out.println(name + "  healed! Health: " + health);
    }
}