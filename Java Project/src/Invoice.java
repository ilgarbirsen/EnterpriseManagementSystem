public class Invoice {

    private Order order;

    public Invoice(Order order){
        this.order = order;
    }

    public void generateInvoice(){
        System.out.println("Generating invoice... ");
        order.dispayOrderDetails();
    }

}
