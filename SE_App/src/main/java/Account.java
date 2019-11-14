
public class Account extends Student {

    private String username;
    private String password;
    char exam;
    int name;

    Account(int id, String name, String surname, char exam, String username, String password) {
        super(id, name, surname, exam);
        this.username = username;
        this.password = password;
    }

    

     
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
  
    
    public void setPassword(String password) {
        this.password=null;
        this.password = password;
    }

}
