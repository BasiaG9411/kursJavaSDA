package Excercise2;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] intArray = new int[10];
        int longest = 1; // Przechowuje informacje o najdłuższym ciągu
        int current = 1;

        for (int i = 0; i < intArray.length; i++) {

           intArray[i] = userInput.nextInt();
       }

        for (int j = 1; j < intArray.length; j++) {
            if (intArray[j - 1] < intArray[j]) {
                current++;
            } else {
                if (current > longest) {
                    longest = current;
                }
                current = 1;
            }
        }
        System.out.println("Najdłuższy ciąg rosnący: " + longest);

    }
}