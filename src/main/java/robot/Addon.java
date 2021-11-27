package robot;

// blueprint representing additional object - Addon

public class Addon {

    private int price;
    private  String name;

    public Addon(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Addon{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
