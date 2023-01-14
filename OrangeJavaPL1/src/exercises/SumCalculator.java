package exercises;

import java.util.Scanner;

//check if sum of two integers is equals to third integer
public class SumCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("please input first integer");
        int a = inputScanner. nextInt();
        System.out.println("please input second integer");
        int b = inputScanner. nextInt();
        System.out.println("please input third integer");
        int c = inputScanner. nextInt();

        System.out.println("input a = " + a + " b = " + b + " c = " + c);

        boolean firstCombination = (a + b) == c;
        boolean secondCombination = (a + c) == b;
        boolean thirdCombination = (b + c) == a;

        if (firstCombination) {
            System.out.println("Found match");
        } else if (secondCombination) {
            System.out.println("Found match");
        } else if (thirdCombination) {
            System.out.println("Found match");
        } else {
            System.out.println("Match not found");

        }

        boolean result = firstCombination || secondCombination || thirdCombination;

        System.out.println(result);

    }
}
