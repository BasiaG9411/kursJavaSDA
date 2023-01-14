package Excercise2;

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String longestText = "";

        System.out.println("Podaj tekst: ");
        String userString = userInput.nextLine();

        while (! userString.equalsIgnoreCase("starczy")) {
            if (longestText.length() < userString.length()) {
                longestText = userString;
            }

            System.out.println("Podaj tekst: ");
            userString = userInput.nextLine();
        }


            if(longestText.equals("")){
                System.out.println("Nie podano żadnego tekstu.");
            } else {
                System.out.println("Najdłuższy podany tekst to: " + longestText);


        }
    }
}