import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//import User;
public class Database {
    private ObjectInputStream objectInput;
    private ObjectOutputStream objectOutput;

    public List<User> getUserInfo(File file){
        List<User>users=new ArrayList<>();

        //open file for reading
        try {
            objectInput=new ObjectInputStream(new FileInputStream(file));

            while (true){
                users.add((User) objectInput.readObject());
            }
        }catch (EOFException eofException){

        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return users;
    }

    //save the user demographic into a data file
    public void saveUserInfo(File file, List<User>users) {
        //open file for writing
        try {
            objectOutput = new ObjectOutputStream(new FileOutputStream(file));

            for (User user : users) {
                objectOutput.writeObject(user);
            }
            objectOutput.flush();
            objectOutput.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
}
