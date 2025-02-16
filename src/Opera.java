public class Opera extends Browser
{
    public Opera(String color, float speed, float popularity) {
        super(color, speed, popularity);
    }

    @Override
    public void open()
    {
        System.out.println("Opening Opera");
    }

    @Override
    public void openTab()
    {
        System.out.println("Opening Opera Tab");
    }

    @Override
    public void closeTab()
    {
        System.out.println("Closing Opera Tab");
    }

    @Override
    public void close()
    {
        System.out.println("Closing Opera");
    }
}
