package Assignment27;

public class Assignment27 {
    public static void main(String[] args) {
        MathOperation add = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        MathOperation sub = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };
        MathOperation mul = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };
        MathOperation div = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                if (b == 0){
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }else {
                    return a / b;
                }
            }
        };

        System.out.println("Addition: " + add.operate(20,5));
        System.out.println("Subtraction: " + sub.operate(30,25));
        System.out.println("Multiplication: " + mul.operate(10,7));
        System.out.println("Division: " + div.operate(125,5));

    }
}
interface MathOperation{
    int operate(int a, int b);
}