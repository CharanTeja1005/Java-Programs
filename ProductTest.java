import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    /***
     * This method is used to provide total cost of the products
     * @param products
     * @return totalCostOfProducts
     */
    private static double getTotalCostOfProducts(Product[] products)
    {
        double totalCostOfProducts = 0;
        for(int i=0;i<products.length;i++) totalCostOfProducts += products[i].getPrice();
        return totalCostOfProducts;
    }

    /**
     * This method is used to get value by product name
     * @param products
     * @param name
     * @return productValue
     */
    private static double getValueByProductName(Product[] products, String name)
    {
        double productValue = 0;
        for(int i=0;i<products.length;i++)
        {
            if(name.equals(products[i].getName()))
            {
                productValue = products[i].getPrice();
                break;
            }
        }
        return productValue;
    }

    /**
     * This method is used to search fro the product whether it exists or not
     * @param products
     * @param name
     * @return "Found" | "Not Found"
     */
    private static String searchProduct(Product[] products, String name)
    {
        for(int i=0;i<products.length;i++)
        {
            if(name.equals(products[i].getName())) return "Found";
        }
        return "Not Found";
    }

    /**
     * This method is used to search all the products that similar name
     * @param products
     * @param name
     * @return List<Product>
     */
    private static List<Product> searchProductsBySimilarName(Product[] products, String name)
    {
        List<Product> arr = new ArrayList<>();
        for(int i=0;i<products.length;i++)
        {
            if(products[i].getName().contains(name)) arr.add(products[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("Apple", 100),
            new Product("Samsung", 90),
            new Product("Oppo", 70),
            new Product("IQOO", 65),
            new Product("MI", 50),
            new Product("Realme", 60)
        };

        System.out.println("Total Cost of Products = " + getTotalCostOfProducts(products));
        System.out.println("Value of \"Apple\" = " + getValueByProductName(products, "Apple"));
    }
}
