package Assignment47;

import java.util.ArrayList;
import java.util.List;

public class Assignment47 {
    public static void main(String[] args) {

        Result<Integer> r1 = new Result<>("Aman", 96);
        Result<Double> r2 = new Result<>("Priyanshu", 93.45);
        Result<String> r3 = new Result<>("Shivansh", "'A' Grade");

        System.out.println("==== printResult() ====");
        r1.printResult(r1);
        r1.printResult(r2);
        r1.printResult(r3);

        System.out.println("==== calculateAverage() ====");
        List<Integer> intScores = new ArrayList<>();
        intScores.add(80);
        intScores.add(85);
        intScores.add(90);
        intScores.add(95);

        List<Double> doubleScores = new ArrayList<>();
        doubleScores.add(75.5);
        doubleScores.add(88.5);
        doubleScores.add(92.0);

        System.out.println("Integer List Average : " + r1.calculateAverage(intScores));
        System.out.println("Double List Average  : " + r1.calculateAverage(doubleScores));

        System.out.println("\n==== addScores() ====");
        List<Number> numberList = new ArrayList<>();
        r1.addScores(numberList);
        System.out.println("List : " + numberList);

        System.out.println("\n==== Pair ====");
        Pair<String, Double> p1 = new Pair<>("Aman", 95.5);
        Pair<String, String> p2 = new Pair<>("Rahul", "A Grade");
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Result<T> {
    private String studentName;
    private T score;

    Result(String studentName, T score) {
        this.studentName = studentName;
        this.score = score;
    }

    String getStudentName() {
        return studentName;
    }

    T getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + ", Score: " + score;
    }

    void printResult(Result<?> result) {
        System.out.println("Name  : " + result.getStudentName());
        System.out.println("Score : " + result.getScore());
        System.out.println("Type  : " + result.getScore().getClass().getSimpleName());
        System.out.println();
    }

    double calculateAverage(List<? extends Number> scores) {
        double total = 0;
        for (Number score : scores) {
            total += score.doubleValue();
        }
        return total / scores.size();
    }

    void addScores(List<? super Integer> list) {
        list.add(85);
        list.add(95);
        list.add(86);
        System.out.println("3 scores added successfully!");
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}