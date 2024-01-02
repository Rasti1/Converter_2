package app;

import java.util.Scanner;

public class Main {

    static double num;
    static double result;
    static Scanner sc = new Scanner(System.in);
    static final double kilometerToMile = 0.62;
    static final double mileToKilometer = 1.61;

    public static void main(String[] args) {

        System.out.println("Converter mile-kilometer/kilometer-mile.\n");
        try {
            System.out.print("Enter a distance value: ");
            num = sc.nextDouble();
            if (num < 0) {
                System.out.println("Impossible value. Please enter a non-negative number.");
            } else {
                result = convertMileToKilometer(num);
                System.out.printf("Converted to kilometers: %.2f\n", result);

                result = convertKilometerToMile(num);
                System.out.printf("Converted to miles: %.2f\n", result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }
    private static double convertKilometerToMile (double num){
        return num * kilometerToMile;
    }
    private static double convertMileToKilometer (double num){
        return num * mileToKilometer;
    }
}
