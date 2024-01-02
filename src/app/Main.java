package app;

import java.util.Scanner;

public class Main {

    static double num;
    static double result;
    static Scanner sc = new Scanner(System.in);
    static final double mileToKilometer = 1.61;

    public static void main(String[] args) {
        System.out.println("Converter mile-kilometer/kilometer-mile");

    }
    private static String getInfo(){
        return "Enter number of miles: ";
    }

    private static double convertMilesToKilometres (double num){
        return num * mileToKilometer;
    }


}
