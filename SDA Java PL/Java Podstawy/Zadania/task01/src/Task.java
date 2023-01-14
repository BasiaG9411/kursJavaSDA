import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Tu zaimplementuj rozwiązanie

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        float weight = scanner.nextFloat();

        if (height > 150 && weight <= 180) {
            System.out.println("Zapnij pasy!");
        } else {
            System.out.println("Przykro mi, nie możesz jechać!");


        }
    }
}