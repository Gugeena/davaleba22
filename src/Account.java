import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Account implements Serializable
{
    private String Email;
    private String Username;
    private transient String Password;
    private transient int ID;

    private static ArrayList<Integer> usedIDs = new ArrayList<>();
    private transient Random rand = new Random();

    public Account(String email, String username, String password, int ID)
    {
        Email = email;
        Username = username;
        Password = password;
        this.ID = ID;
        usedIDs.add(ID);
    }

    public Account(String email, String username, String password)
    {
        Email = email;
        Username = username;
        Password = password;
        setID();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int  getID() {
        return ID;
    }

    private void setID()
    {
        int newID;

        while (true)
        {
            newID = Math.abs(rand.nextInt());

            if (newID > 0 && !usedIDs.contains(newID))
            {
                break;
            }
        }
        this.ID = newID;
        usedIDs.add(newID);
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "Email='" + Email + '\'' +
                ", Username='" + Username + '\'' +
                '}';
    }
}
