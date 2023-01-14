package exercises;

import java.util.Scanner;

//base on provided input calculate multiplications from 1 to 10
public class MultiplicationCalculator {
    public static void main(String[] args) {
        //get input from console
        Scanner inputScanner = new Scanner(System.in);
        int x = inputScanner.nextInt();

        System.out.println("x = " + x);

        //calculate multiplication

        for (int a = 1 ; a <= 10; a++){
            int b = x * a;
            System.out.println(b);
        }
    }
}
