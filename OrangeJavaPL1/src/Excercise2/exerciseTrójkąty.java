package Excercise2;

import java.util.Scanner;

public class exerciseTrójkąty {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = userScanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
            //System.out.println();
        }
    }
}