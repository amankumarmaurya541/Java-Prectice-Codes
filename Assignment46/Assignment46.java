package Assignment46;

public class Assignment46 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Aman");
        Box<Integer> integerBox = new Box<>(1000);
        Box<Double> doubleBox = new Box<>(89.0);

        System.out.println("\n==== Box Values ====");
        System.out.println(stringBox);
        System.out.println(integerBox);
        System.out.println(doubleBox);

        System.out.println("\n==== Get Values ====");
        System.out.println("String Box: " + stringBox.getValue());
        System.out.println("Integer Box: " + integerBox.getValue());
        System.out.println("Double Box: " + doubleBox.getValue());

        System.out.println("\n==== Print Type ====");
        TypePrint.printType("Aman");
        TypePrint.printType(1000);
        TypePrint.printType(89.0);
    }
}
class Box<T>{
    private T value;
    Box( T value){
        this.value = value;
    }
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
    @Override
    public String toString(){
        return "Box{Value: " + value + "}";
    }
}
class TypePrint{
   public static<T> void printType(T value){
       System.out.println("Value: " + value);
       System.out.println("type: " + value.getClass().getSimpleName());
       System.out.println();
    }
}