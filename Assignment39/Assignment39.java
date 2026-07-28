package Assignment39;

public class Assignment39 {
    public static void main(String[] args) {
        System.out.println("==== All Food Items ====");
        for (FoodItem foodItem: FoodItem.values()){
            System.out.println(foodItem);
        }
        System.out.println();
        System.out.println(" ==== Name And Ordinal ====");
        for (FoodItem foodItem : FoodItem.values()){
            System.out.println(foodItem.name() + " --> Ordinal: " + foodItem.ordinal());
        }
        System.out.println();
        System.out.println(" ==== Affordable Item (Budget: 200.0) ====");
        double budget = 200.0;
        for (FoodItem item : FoodItem.values()){
            if (item.isAffordable(budget)){
                System.out.println(item.getItemName() + " Is Affordable.");
            }else {
                System.out.println(item.getItemName() + " Is Not Affordable.");
            }
        }
        System.out.println();
        System.out.println("==== Prize Of Pizza ====");
        System.out.println("Pizza prize: " + FoodItem.PIZZA.getPrice());

    }
}
enum FoodItem{
    PIZZA("Pizza", 299),
    BURGER("Burger", 149),
    PASTA("Pasta", 199),
    MAGGIE("Maggie", 99);

    private final String itemName;
    private final double price;

    FoodItem(String itemName, double price){
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return ("Name: " + getItemName() + ", Price: " + getPrice());
    }

    boolean isAffordable(double budget){
        if (price <= budget){
            return true;
        }else {
            return false;
        }
    }
}