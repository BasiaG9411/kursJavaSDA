package Excercise2;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = inputScanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = inputScanner.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = inputScanner.nextInt();

        double Delta = b * b - 4 * a * c;
        System.out.println("Delta = " + Delta);


        if (Delta > 0) {
            double x1 = (-b - Math.sqrt(Delta)) / 2 * a;
            double x2 = (-b + Math.sqrt(Delta)) / 2 * a;
            System.out.println("Miejsce zerowe x1 = " + x1 + " " + "Miejsce zerowe x2 = " + x2);
        } else if (Delta == 0 ){
            double x3 = (-b) / (2.0 * a);
            System.out.println("Miejsce zerowe = " + x3 );

        } else {
            System.out.println("Delta zerowa brak rozwiązań");
        }


    }
}
