import java.util.List;

public class ReportGenerator {

    public void generateSalesReport(List<Order> orders){
        System.out.println("Sales Report: ");
        double totalSales = orders.stream().mapToDouble(Order::getTotalAmount).sum();
        System.out.println("Total Sales: $" + totalSales);
    }

}
