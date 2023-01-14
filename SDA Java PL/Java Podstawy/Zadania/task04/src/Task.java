import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        int numberOfInstallments = scanner.nextInt();

        if (amount > 100 && amount < 10000) {
        } else {
            amount = 5000;
        }

        if (numberOfInstallments >= 6 && numberOfInstallments <= 48) {

        } else {
            numberOfInstallments = 36;
        }
        if (numberOfInstallments > 5 && numberOfInstallments < 13) {
            double a = 0.025 * amount;
            double aa = (a + amount) / numberOfInstallments;
            System.out.println(aa);
        } else if (numberOfInstallments > 12 && numberOfInstallments < 25) {
            double a = 0.05 * amount;
            double aa = (a + amount) / numberOfInstallments;
            System.out.println(aa);
        } else if (numberOfInstallments > 24 && numberOfInstallments < 49) {
            double a = 0.10 * amount;
            double aa = (a + amount) / numberOfInstallments;
            System.out.println(aa);
        } else {
            System.out.println(0);
        }

    }

}
