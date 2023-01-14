package Excercise2;

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        char input1 = userInput.next().charAt(0);
        System.out.println("Podaj literę: ");
        char input2 = userInput.next().charAt(0);

        System.out.println(Math.abs(input2 - input1) - 1); // wartość bezwzględna

    }
}
