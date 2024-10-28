public class EmailService extends Notification {
    @Override
    public void sendNotification(String message, User user){
        System.out.println("Email sent to " + user.getEmail() + ": " + message);
    }
}
