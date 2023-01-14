package MineExercise;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = userScanner.nextInt();


            for (int j = 1; j <= n; j++) {
                System.out.print("   **   ");
            }
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print("  *  *  ");
            }
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print(" *    * ");
            }
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print("*      *");
            }

        }
    }


