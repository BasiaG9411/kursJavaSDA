package Excercise2;

import java.util.Scanner;

public class Excercise01 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        final float myPI = 3.14F;

        System.out.println("Podaj średnicę okręgu: ");
        float diameter = inputScanner.nextFloat();

        System.out.println("Obwód koła z myPI: " + (myPI * diameter));
        System.out.println("Obwód koła z Math.PI: " + (Math.PI * diameter));

    }
}
