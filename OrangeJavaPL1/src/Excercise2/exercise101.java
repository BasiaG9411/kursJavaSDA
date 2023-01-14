package Excercise2;

import java.util.Scanner;

public class exercise101 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = userInput.nextInt();

        System.out.println("Podana liczba: " + n);
        for (int i = 1; n >= i; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");


            }
        }
    }
}