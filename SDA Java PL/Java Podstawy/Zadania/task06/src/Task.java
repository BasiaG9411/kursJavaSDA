import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int counter = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
        counter += i;

            }  System.out.println(counter);
        } else {
            System.out.println("Robota skończona");
        }
    }
}