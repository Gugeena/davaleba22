import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       amocana1();
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
}