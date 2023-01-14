import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = scanner.nextDouble();

        if (income < 85528.00 && income > 3089) {
            double a = ((income * 0.18) - 556.02);
            System.out.println(a);
        } else if (income >= 85528.00){
            double b = (((income - 85528.00) * 0.32) + 14839.02);
            System.out.println(b);
        } else {
            System.out.println(0);
        }



    }


    }
