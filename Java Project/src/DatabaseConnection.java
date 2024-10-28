public class DatabaseConnection {

    private static DatabaseConnection instace;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if (instace == null){
            instace = new DatabaseConnection();
        }
        return instace;
    }

    public void connect(){
        System.out.println("Connected to the Database. ");
    }

    public void disconnect(){
        System.out.println("Disconnect from the database. ");
    }

}
