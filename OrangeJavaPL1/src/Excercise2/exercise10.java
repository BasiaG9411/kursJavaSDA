package Excercise2;

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = userInput.nextInt();
        int result = 0;

        while (number != 0) {
            System.out.println("Liczba wejściowa: " + number + " | Dodajemy do sumy liczbę: " + number%10);
            result += number % 10;
            number /= 10;
        }

        System.out.println("Suma cyfr liczby to: " + result);


        }

        }





