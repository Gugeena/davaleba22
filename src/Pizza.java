import java.io.Serializable;

public class Pizza implements Serializable
{
    private String Cheese;
    private String Toppings;
    private String Sauce;

    public Pizza(String cheese, String toppings, String sauce) {
        Cheese = cheese;
        Toppings = toppings;
        Sauce = sauce;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public String getToppings() {
        return Toppings;
    }

    public void setToppings(String toppings) {
        Toppings = toppings;
    }

    public String getSauce() {
        return Sauce;
    }

    public void setSauce(String sauce) {
        Sauce = sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Cheese='" + Cheese + '\'' +
                ", Toppings='" + Toppings + '\'' +
                ", Sauce='" + Sauce + '\'' +
                '}';
    }
}
