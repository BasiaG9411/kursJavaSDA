package MineExercise;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();

        for (int i = 2; i < n; i++) {
            System.out.print(i + " ");
        }
    }
}
