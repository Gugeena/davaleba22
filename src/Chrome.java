public class Chrome extends Browser
{
    public Chrome(String color, float speed, float popularity) {
        super(color, speed, popularity);
    }

    @Override
    public void open()
    {
        System.out.println("Opening Chrome");
    }

    @Override
    public void openTab()
    {
        System.out.println("Opening Chrome Tab");
    }

    @Override
    public void closeTab()
    {
        System.out.println("Closing Chrome Tab");
    }

    @Override
    public void close()
    {
        System.out.println("Closing Chrome");
    }
}
