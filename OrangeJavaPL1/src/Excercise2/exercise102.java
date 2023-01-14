package Excercise2;

import java.util.Scanner;

public class exercise102 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = userInput.nextInt();
        int l = 0;

        while ( n != 0 ) {
            System.out.println("Liczba wejściowa: " + n + " | Dodajemy do sumy liczbę: " + n%10);
            l = l * 10 + (n % 10);
            n /= 10;

            System.out.println("Lustrzane odbice liczby: " + l);

        }
    }
}