


public class Account extends Student{
    private String username;
    private String password;
    
    Account(int id, String name, String surname, char exam, String username,String password) {
        super(id, name, surname, exam);
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
