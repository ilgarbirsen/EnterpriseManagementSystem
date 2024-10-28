import java.util.List;

public class Order {

    private List<Product> orderedProducts;
    private double totalAmount;

    public Order(List<Product> orderedProducts){
        this.orderedProducts = orderedProducts;
        calculateTotal();
    }

    private void calculateTotal() {
        totalAmount = orderedProducts.stream().mapToDouble(p -> p.getPrice() * p.getQuantity()).sum();
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void dispayOrderDetails(){
        System.out.println("Order Summary: ");
        orderedProducts.forEach(p -> System.out.println("Product: " + p.getProductName() + ", Quantity: " + p.getQuantity()));
        System.out.println("Total Amount: $" + totalAmount);
    }

}
