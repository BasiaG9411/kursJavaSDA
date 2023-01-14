package Excercise2;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kilogramach: ");
        float weight = inputScanner.nextFloat();
        System.out.println("Podaj swój wzrost w cm.: ");
        int height = inputScanner.nextInt();

        float convertedHeight = height / 100F;

        float BMI = weight / (convertedHeight * convertedHeight);
// double BMI = weight / Math.pow(convertedHeight, 2); ----> podnoszenie do potęgi
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }

    }
}
