package Excercise2;

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = userInput.nextLine();

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word + " " + word + " ");
        }

    }
}