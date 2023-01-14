import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

if (n > 0) {
    for (int i = n; i >= 0; i--) {
        System.out.print(i + " ");
    }
} else if (n == 0) {
    System.out.print(0);
} else {
    for (int i = n; i <= 0; i++) {
        System.out.print(i + " ");
    }
}

    }
}