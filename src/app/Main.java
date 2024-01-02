package app;

import java.util.Scanner;

public class Main {

    static double num;
    static double result;
    static Scanner sc = new Scanner(System.in);
    static final double kilometerToMile = 0.62;
    static final double mileToKilometer = 1.61;

    public static void main(String[] args) {
        System.out.println("Converter mile-kilometer/kilometer-mile\n");
        String info = getKilometersInfo();
        System.out.print(info);
        try{
            num = sc.nextDouble();
            if (num < 0){
                System.out.println("Impossible value of miles. ");
            } else {
                result = convertMilesToKilometres(num);
                System.out.printf("Kilometers equals is %.2f ", result);
            }
        } catch(Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        try{
            num = sc.nextDouble();
            if (num < 0){
                System.out.println("Impossible value of kilometers. ");
            } else {
                result = convertKilometresToMiles(num);
                System.out.printf("Mile equals is %.2f ", result);
            }
        } catch(Exception e){
            System.out.println("Invalid input. Please enter a valid number.");
        }

    }

    private static String getKilometersInfo(){
        return "Enter number of kilometres: ";
    }
    private static String getMilesInfo(){
        return "Enter number of miles: ";
    }

    private static double convertMilesToKilometres (double num){
        return num * mileToKilometer;
    }
    private static double convertKilometresToMiles (double num){
        return num * kilometerToMile;
    }
}
