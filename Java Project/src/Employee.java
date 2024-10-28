public class Employee extends User{

    String department;

    public Employee(String name, String email, String department) {
        super(name, email);
    }

    @Override
    public void login(){
        System.out.println(getName() + " has logged in as an Employee. ");
    }

    public void completeTask(){
        System.out.println("Task completed by: " + getName());
    }

}

