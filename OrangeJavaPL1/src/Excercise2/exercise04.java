package Excercise2;

import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int n = userScanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("pif paf");
            } else if (i % 3 == 0){
                System.out.println("pif");
            } else if (i % 7 == 0){
                System.out.println("paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
