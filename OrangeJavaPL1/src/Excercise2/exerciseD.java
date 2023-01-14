package Excercise2;

import java.util.Scanner;

public class exerciseD {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int result = 0;

        System.out.println("Podaj liczbę: ");
        int userNumber = userInput.nextInt();


        while (userNumber !=0) {
            result += userNumber;

            System.out.println("Podaj kolejną liczbę: ");
            userNumber = userInput.nextInt();
        }
        System.out.println("Suma podanych liczb: " + result);


    }
}
