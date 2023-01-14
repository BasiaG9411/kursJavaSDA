package Excercise2;

import java.util.Scanner;

public class exerciseE4 {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj operację: ");
        String txt = inputScanner.nextLine();
        System.out.println("Podaj liczbę: ");
        double firstNumber = inputScanner.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double secondNumber = inputScanner.nextDouble();

        if (txt.equals("dodawanie")) {
            System.out.println(firstNumber + secondNumber);
        } else if (txt.equals("odejmowanie")) {
            System.out.println(firstNumber - secondNumber);
        } else {
            System.out.println();

        }
    }
}
