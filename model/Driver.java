package model;
//Driver info
public class Driver extends User{


    public Driver() {
    }

    public Driver(String username, String password) {
        super(username, password);
    }

    public Driver(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Driver(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    public Driver(int id, String firstName, String lastName, String username, String password) {
        super(id, firstName, lastName, username, password);
    }

    public Driver(int id, String firstName, String lastName, String username, String password, String salt) {
        super(id, firstName, lastName, username, password, salt);
    }
}
