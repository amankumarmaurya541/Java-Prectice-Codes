package Assignment12;

public class Assignment12 {
    public static void main(String[] args) {
        Shape s = new Rectangle(20, 20);
        Shape c = new Circle(20);
        System.out.println("Area and Perimeter Of a Rectangle:");
        s.printInfo();
        System.out.println("-------------------------------------------");
        System.out.println("Area and Perimeter Of a Circle:");
        c.printInfo();

    }
}

abstract class Shape{
    abstract double area();
    abstract double perimeter();
    void printInfo(){
        System.out.println("Area: " + area());
        System.out.println("perimeter: " + perimeter());

    }
}

class Rectangle extends Shape{
    private double length;
    private double breath;

    Rectangle(double length, double breath){
        this.length = length;
        this.breath = breath;
    }
    double area(){
        return length * breath;
    }
    double perimeter(){
        return 2 * (length + breath);
    }

}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return 3.14 * radius * radius;
    }
    double perimeter(){
        return 2 * 3.14 * radius;
    }
}
