import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean driver;

    public User(){    }

    public User(String firstName, String lastName, String userName, String password){
        this.firstName= firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
        this.driver= false;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setDriver()
    {
        this.driver=true;
    }
    public boolean isDriver()
    {
        return this.driver;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    
    
}
