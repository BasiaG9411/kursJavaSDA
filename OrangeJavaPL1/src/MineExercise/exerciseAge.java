package MineExercise;

import java.util.Scanner;

public class exerciseAge {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj wiek ");
        int age = inputScanner.nextInt();

       /* if (age >= 18) {
            //System.out.println("Osoba pełnoletnia ");
        } else {
            System.out.println("Osoba niepełnoletnia ");
        */

        String ageText = age >= 18 ? "Osoba pełnoletnia " : "Osoba niepełnoletnia "; // ? - if,  : - else
        System.out.println(ageText);
    }
    }

