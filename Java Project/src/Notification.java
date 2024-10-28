public class Notification {

    public void sendNotification(String message, User user){
        System.out.println("Sending notification to " + user.getEmail() + ": " + message);
    }

}

