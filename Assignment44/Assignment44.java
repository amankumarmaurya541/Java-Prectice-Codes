//📝 Assignment 1 — EASY
//🔤 String Inspector
//Q1. Take a String sentence = "Hello World Java Programming" and:
//
//Print total length
//Print first character using charAt()
//Print last character using charAt() and length()
//Print index of word "Java" using indexOf()
//Print "World" using substring()
//
//Q2. Perform these operations and print results:
//
//Convert to uppercase
//Convert to lowercase
//Replace "Java" with "Python"
//Check if contains "World" → print true/false
//Check if starts with "Hello" → print true/false
//Check if ends with "Programming" → print true/false
//
//Q3. Take a String with extra spaces "   Java is awesome   " and:
//
//Print length before trim
//Print length after trim
//Print trimmed string
package Assignment44;

public class Assignment44 {
    public static void main(String[] args) {
        String s = "Hello World Java Programming";
        System.out.println("Length: " + s.length());
        System.out.println("First Character: " + s.charAt(0));
        System.out.println("Last Character: " + s.charAt(s.length() - 1));
        System.out.println("Index of Java: " + s.indexOf("Java"));
        System.out.println("\nSubstring World: " + s.substring(6, 11));
        System.out.println("Upper Case: " + s.toUpperCase());
        System.out.println("Lower Case: " + s.toLowerCase());
        System.out.println("Replace Java with Python: " + s.replace("Java", "Python"));
        System.out.println("Contain World: " + s.contains("World"));
        System.out.println("Starts with Hello: " + s.startsWith("Hello"));
        System.out.println("\nEnd With Programming: " + s.endsWith("Programming"));

        String s1 = "   Java is awesome   ";
        System.out.println("Length Before Trim: " + s1.length());
        s1 = s1.trim();
        System.out.println("Length After trim: " + s1.length());
        System.out.println("Trimed String: " + s1);
    }
}
