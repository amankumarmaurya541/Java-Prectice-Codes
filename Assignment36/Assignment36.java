package Assignment36;

public class Assignment36 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 21343245, 55000);
        Product p2 = new Product("Laptop", 21343245, 55000);
        Product p3 = new Product("Phone", 21432445, 65000);

        System.out.println("\n--- toString() ---");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n--- equals() ---");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("P1.equals(p3): " + p1.equals(p3));

        System.out.println("\n--- hashCode ---");
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());

        System.out.println("\n--- getClass() ---");
        System.out.println("p1 class: " + p1.getClass().getSimpleName());
        System.out.println("p2 class: " + p2.getClass().getSimpleName());
        System.out.println("p3 class: " + p3.getClass().getSimpleName());

    }
}
class Product{
    private String productName;
    private int productId;
    private double price;

    Product(String productName, int productId, double price){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }
    String getProductName() {
        return productName;
    }
    int getProductId(){
        return productId;
    }
    double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return ("Product Name: " + getProductName() + ", Product ID: " + getProductId() + ", Price: " + getPrice());
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Product other = (Product) obj;
        return  this.productId == other.productId;
    }
    @Override
    public int hashCode(){
        return productId * 31 + productName.hashCode();
    }

}
