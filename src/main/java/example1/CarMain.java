package example1;

import java.util.Arrays;

public class CarMain {

    public static void main(String[] args) {   ///static nereikia kurt object

        Car audi = new Car();
        audi.yearCreated = 2021;
        audi.brand = "Audi";
        audi.weight = 1500.00;
        audi.isElectric = true;

        System.out.println(audi);

        audi.turnOnEngine();
        audi.move();
        audi.playSong("Juda Orchideja");

        Car bmw = new Car(1998, 1400.5, 300, "BMW", false);
        System.out.println(bmw);

        int[] numbers = { 5, 3, 6 };
        String[] names = {"Rasa", "Paulina", "Andrius"};

        Car[] garazas = new Car[3];

        garazas[0] = audi;
        garazas[2] = bmw;

        System.out.println(Arrays.toString(garazas));
        System.out.println(Arrays.toString(names));

        for (int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index] + " ");
        }

        System.out.println();

        garazas[1] = new Car(2021, 1111, 50, "Ferrari", false);

        for (Car car : garazas) {             //    iter   generates for each cycle
            System.out.println(car.brand);

            car.turnOnEngine();
            car.playSong(car.brand);
        }

    }
}
