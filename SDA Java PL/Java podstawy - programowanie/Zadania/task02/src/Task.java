import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
if (n <= 110 && n >= 90) {
    System.out.println(true);
} else {
    System.out.println(false);
}
    }
}