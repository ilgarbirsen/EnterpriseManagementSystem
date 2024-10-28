public class Payment {

    private Order order;

    public Payment(Order order) {
        this.order = order;
    }

    public void processPayment(){
        System.out.println("Processing Payment for total amount: $" + order.getTotalAmount());
        System.out.println("Payment successful. ");
    }

}
