import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        if (n < 0 && m > 0) {
            System.out.println("true");
        } else if (n == 0 || m == 0) {
            System.out.println("false");
        } else if (n > 0 && m < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}