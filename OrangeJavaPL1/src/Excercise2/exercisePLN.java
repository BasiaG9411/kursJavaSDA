package Excercise2;

import java.util.Scanner;

public class exercisePLN {
    public static void main(String[] args) {
        final double valueOfEUR = 4.69;
        final double valueOfUSD = 4.43;
        final double valueOfGBP = 5.38;
        final double valueOfCZK = 0.19;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj ilość PLN");
        double PLN = userInput.nextDouble();
        userInput.nextLine(); //Wymagane, jeżeli po nextInt/nextFloat/NextDouble używamy nextLine
        System.out.println("Podaj nazwę waluty");
        String txt = userInput.nextLine();

        switch (txt.toUpperCase()) {
            case "EUR":
                System.out.println("Po wymianie będzie to " + PLN / valueOfEUR + " EUR");
                break;
            case "USD":
                //System.out.printf("PLN -> USD to: %.2f", (PLN/valueOfUSD)); - zaokrąglone do dwóch miejsc po przecinku
                System.out.printf("Po wymianie będzie to: %.2f", (PLN/valueOfUSD));
                break;
            case "GBP":
                System.out.println("Po wymianie będzie to " + PLN / valueOfGBP + " GBP");
                break;
            case "CZK":
                System.out.println("Po wymianie będzie to " + PLN / valueOfCZK + "CZK");
                break;
            default:
                System.out.println("Nie rozpoznano waluty");
                break;
        }

    }
}

