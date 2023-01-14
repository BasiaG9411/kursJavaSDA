package Excercise2;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = userInput.nextLine();

        double counter = 0;
        char[] chars = text.toCharArray();
        for (char input : chars) {
            if (input == ' ') {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(Math.round(counter/text.length()*100));
    }
}