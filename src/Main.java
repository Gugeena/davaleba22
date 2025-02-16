import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       amocana1();
       amocana2();
       amocana3();
    }

    public static void amocana1()
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\Txt.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

            ArrayList<Pizza> arrpiz = new ArrayList<>();

            for(int i = 0; i < 4; i++)
            {
                arrpiz.add(new Pizza("Mozzarela", "Peperoni", "Tomato"));
            }

            objectOutputStream.writeObject(arrpiz);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\Txt.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

            ArrayList<Pizza> moricano = (ArrayList<Pizza>) objectInputStream.readObject();

            objectInputStream.close();

            System.out.println(moricano);
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void amocana2()
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\YxY.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

            FireFox fireFox = new FireFox("Blue", 128f, 729);
            Chrome chrome = new Chrome("Orange", 86f, 4500);
            Opera opera = new Opera("Red", 96f, 2000);

            objectOutputStream.writeObject(fireFox);
            objectOutputStream.writeObject(chrome);
            objectOutputStream.writeObject(opera);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\YxY.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

            FireFox fireFox1 = (FireFox) objectInputStream.readObject();
            Chrome chrome1 = (Chrome) objectInputStream.readObject();
            Opera opera1 = (Opera) objectInputStream.readObject();

            fireFox1.open();
            fireFox1.openTab();
            fireFox1.closeTab();
            fireFox1.close();

            chrome1.open();
            chrome1.openTab();
            chrome1.closeTab();
            chrome1.close();

            opera1.open();
            opera1.openTab();
            opera1.closeTab();
            opera1.close();

            objectInputStream.close();
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void amocana3()
    {
        try
        {
            Account account1 = new Account("NapoleonBonaparte@Icloud.com", "General", "password1", 1515);
            Account account2 = new Account("DukeOfWellington@Gmail.com", "The Conquerer", "password2");
            Account account3 = new Account("CharlesOliviera@Yahoo.com", "Do Bronx", "password3");

            ArrayList<Account> accounts = new ArrayList<>();

            accounts.add(account1);
            accounts.add(account2);
            accounts.add(account3);

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\BxB.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

            objectOutputStream.writeObject(accounts);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\BxB.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);

            ArrayList<Account> accounts3 = (ArrayList<Account>) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(accounts3);
        }
        catch (IOException | ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}