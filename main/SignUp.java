import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SignUp {
    private Database db;
    private File userFile;
    private List<User> users;


    public SignUp(){
        db=new Database();
        userFile=new File("user.db");
    }

    //add new User
    public void register(User u){
        if (userFile.exists()){
            users=db.getUserInfo(userFile);
        }else {
            users=new ArrayList<>();
        }
        //randomly generated user id
        u.setId(new Random(10000001).nextInt(9000009));
        

        users.add(u);
        db.saveUserInfo(userFile,users);
    }

}
