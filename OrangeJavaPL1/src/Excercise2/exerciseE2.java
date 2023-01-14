package Excercise2;

import java.util.Scanner;

public class exerciseE2 {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = userScanner.nextInt();
        int b = 1;

        for (int i = 1; i <= n; i++) {
            b *= i;
        }
        System.out.println(b);
    }
}
