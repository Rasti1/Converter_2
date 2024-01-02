package app;

import java.util.Scanner;

public class Main {
    static double num;
    static double result;
    static Scanner sc = new Scanner(System.in);
    static final double kilometerToMile = 0.62;

    public static void main(String[] args) {
        System.out.println("Converter mile-kilometer/kilometer-mile\n");
        String info = getInfo();
        System.out.print(info);
    }

    private static String getInfo(){
        return "Enter number of kilometres: ";
    }

    private static double convertKilometresToMiles (double num){
        return num * kilometerToMile;
    }


}
