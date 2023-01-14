package Excercise2;

import java.util.Scanner;

public class exerciseE3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String text = userInput.nextLine();

        while (text.equals("koniec")== false) {

            System.out.println(text);
            System.out.println("Podaj kolejne słowo");
            text = userInput.nextLine();

        }
    }
}