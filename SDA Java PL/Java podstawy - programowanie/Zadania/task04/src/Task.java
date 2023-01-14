import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int zamowionaKapusta = scanner.nextInt();

int sloiki7kg = zamowionaKapusta / 7;
int sloiki1kg = zamowionaKapusta % 7;

if (sloiki1kg + sloiki7kg <= 6){
    System.out.println(true);
} else {
    System.out.println(false);
}







    }
}