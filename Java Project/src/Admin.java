public class Admin extends User{

    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public void login() {
        System.out.println(getName() + " has logged in as an Admin. ");
    }

    public void manageUser(User user){
        System.out.println("Admin managing user: " + user.getName());
    }
}
