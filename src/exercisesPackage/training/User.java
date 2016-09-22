package exercisesPackage.training;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Oleksii on 22.09.2016.
 */
public class User {
    private String username;
    private String password;


    public User(){

    }

    public User(User sourceObject){
        this.username = sourceObject.username;
        this.password = sourceObject.password;
    }

    public User(String uName, String uPswd){
        this.username = uName;
        this.password = uPswd;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setUsername(String value){
        this.username = value;
    }

    public void setPassword(String pswd){
        this.password = pswd;
    }

    public static void main(String[] args) {
        User farns = new User();
        farns.setUsername("TestUsername");
    }

    @Test
    public void usernameMustBeTestUsername(User u){
        assertEquals("TestUsername", u.getUsername());
    }
}
