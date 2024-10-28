import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product added: " + product.getProductName());
    }

    public void removeProduct(Product product){
        products.remove(product);
        System.out.println("Product removed: " + product.getProductName());
    }

    public void showInventory(){
        for (Product p : products){
            System.out.println("Product: " + p.getProductName() + ", Price: $" + p.getPrice() + ", Quantity: " + p.getQuantity());
        }
    }

}
