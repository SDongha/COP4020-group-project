package model;
//Rider info
public class Rider extends User{


    public Rider() {
    }

    public Rider(String username, String password) {
        super(username, password);
    }

    public Rider(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Rider(String firstName, String lastName, String username, String password) {
        super(firstName, lastName, username, password);
    }

    public Rider(int id, String firstName, String lastName, String username, String password) {
        super(id, firstName, lastName, username, password);
    }

    public Rider(int id, String firstName, String lastName, String username, String password, String salt) {
        super(id, firstName, lastName, username, password, salt);
    }
}
