import java.io.Serializable;

public class Browser implements Serializable
{
    //color, speed, popularity და მეთოდები open(), openTab(), closeTab(), close().

    private String color;
    private float speed;
    private float popularity;

    public Browser(String color, float speed, float popularity)
    {
        this.color = color;
        this.speed = speed;
        this.popularity = popularity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public void open()
    {
        System.out.println("Opening Browser");
    }

    public void openTab()
    {
        System.out.println("Opening Browser Tab");
    }

    public void closeTab()
    {
        System.out.println("Closing Browser Tab");
    }

    public void close()
    {
        System.out.println("Closing Browser");
    }

    @Override
    public String toString() {
        return "Browser{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", popularity=" + popularity +
                '}';
    }
}
