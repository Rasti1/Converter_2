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

    private static String getInfo(){
        return "Enter number of kilometres: ";
    }

    private static double convertKilometresToMiles (double num){
        return num * kilometerToMile;
    }


}
