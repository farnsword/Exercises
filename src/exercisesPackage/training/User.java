package exercisesPackage.training;

import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;

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



    @Test
    public void usernameMustBeTestUsername(){
        User farns = new User();
        farns.setUsername("TestUsername");
        assertEquals("TestUsername", farns.getUsername());

        User burns = new User("TestUsername", "TestPassword");
        assertEquals("TestUsername", burns.getUsername());
        assertEquals("TestPassword", burns.getPassword());

        User verns = new User(burns);
        assertEquals(burns.getPassword(), verns.getPassword());
    }
}
