public class Product {
    String name;
    double price;

    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
    
    public String getName() {
        return this.name;
    }
}