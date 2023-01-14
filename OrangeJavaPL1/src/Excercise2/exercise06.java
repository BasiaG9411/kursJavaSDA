package Excercise2;

import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Podaj liczbę");
        int n = userInput.nextInt();

        double result = 1.0;

        for (int i = 2; i <= n; i++) {
            result += 1.0/i;
            }
        System.out.println("Wynik: " + result);
        }
    }
