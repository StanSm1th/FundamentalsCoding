package Task1;

import java.util.Scanner;


public class CalculateAverage {

    public CalculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double[] listOfNumbers = new double[number];
        double total = 0;

        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.print("Enter Element No." + (i + 1) + ": ");
            listOfNumbers[i] = scanner.nextDouble();
        }
        scanner.close();

        for (int i = 0; i < listOfNumbers.length; i++) {
            total = total + listOfNumbers[i];
        }
        double average = total / listOfNumbers.length;

        System.out.println("");
        System.out.format("The average is: %.3f", average);
        System.out.println("");

    }
}



