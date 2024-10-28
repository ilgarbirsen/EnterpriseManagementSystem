import java.util.Arrays;

public class EnterpriseManagementApp {
    public static void main(String[] args) {

        // Kullanıcı ve Envanter
        Admin admin = new Admin("Ilgar", "ilgarbirsen02@gmail.com");
        Employee emp = new Employee("Ilgar", "ilgarbirsen02@gmail.com", "IT");

        Product laptop = new Product("Laptop", 1500.00, 5);
        Product phone = new Product("Phone", 800.00, 10);

        Inventory inventory = new Inventory();
        admin.manageUser(emp);
        inventory.addProduct(laptop);
        inventory.addProduct(phone);

        // Sipariş, Ödeme ve Fatura
        Order order = new Order(Arrays.asList(laptop, phone));
        Payment payment = new Payment(order);
        Invoice invoice = new Invoice(order);

        invoice.generateInvoice();
        payment.processPayment();

        // Bildirim Gönderme
        Notification notification = new EmailService();
        notification.sendNotification("Thank you for your purchase! ", emp);

        // Veri Bağlantısı
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
        db.disconnect();

    }
}