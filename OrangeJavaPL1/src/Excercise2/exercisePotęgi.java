package Excercise2;

import java.util.Scanner;

public class exercisePotęgi {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = userScanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Potęga dla i=" + i + " to: " + Math.pow(2, i));

        }
    }
}