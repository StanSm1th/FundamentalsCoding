package example1;
/*
class is objects blueprint
        */

public class Car {

    // description (how car will look: )
    int yearCreated;
    double weight;
    int price;
    String brand;
    boolean isElectric; //     isOld, isNew, shouldExplode....

    public Car() {
        ////  default constructor
        System.out.println("invoking car constructor to build a Car");
    }

    public Car(int yearCreated, double weight, int price, String brand, boolean isElectric) {
        this.yearCreated = yearCreated;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.isElectric = isElectric;
    }



    //Describes BEHAVIOR (what car will do: )

    void turnOnEngine() {      // void nieko negrazina, bet kazka daro
        System.out.println("Engine is ON...");
    }

    void move() {
        System.out.println("Car is moving...");
    }

    // sis metodas turi viena parametra
    void playSong(String songName) {
        System.out.println("Playing song " + songName + ".mp3");
    }

    int getYearCreated() {
        return yearCreated;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearCreated=" + yearCreated +
                ", weight=" + weight +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
