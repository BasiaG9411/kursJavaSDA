package Excercise2;

import java.util.Scanner;

public class exerciseE5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String txt = userInput.nextLine();
        String concatOfString = "";


        while (!txt.equals("koniec")) {
            concatOfString = concatOfString + " " + txt;

            System.out.println("Podaj tekst: ");
            txt = userInput.nextLine();

            System.out.println("Utworzony tekst:");
            System.out.println(concatOfString);
        }
    }
}