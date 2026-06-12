package Assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = input.nextInt();
        Circle C = new Circle(radius);

        C.area();
        C.perimeter();
    }
}
class Circle{
    int radius;
    final double PI = 3.14159;

    void area(){
        double area = PI * radius * radius;
        System.out.println("Area Of A Circle: " + area);
    }
    void perimeter(){
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter Of A Circle: " + perimeter);
    }
    Circle(int radius){
        this.radius = radius;
    }

}
