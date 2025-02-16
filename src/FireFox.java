public class FireFox extends Browser
{
    public FireFox(String color, float speed, float popularity) {
        super(color, speed, popularity);
    }

    @Override
    public void open()
    {
        System.out.println("Opening FireFox");
    }

    @Override
    public void openTab()
    {
        System.out.println("Opening FireFox Tab");
    }

    @Override
    public void closeTab()
    {
        System.out.println("Closing FireFox Tab");
    }

    @Override
    public void close()
    {
        System.out.println("Closing FireFox");
    }
}
