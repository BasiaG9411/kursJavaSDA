package Excercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LocalDate now = LocalDate.now();
        System.out.println("Podaj datę kolejnego spotkania ");
        String day = userInput.nextLine();

        LocalDate secondLesson = LocalDate.parse(day, DateTimeFormatter.ISO_LOCAL_DATE);

        //System.out.println("Kolejne spotkanie za " + (secondLesson.getDayOfYear() - now.getDayOfYear()) + " dni");

        if (secondLesson.isBefore(now)) { //zabezpieczenie od podania daty z przeszłości
            System.out.println("Podałeś datę z przeszłości. ");
        } else {
            System.out.println("Kolejne spotkanie za " + (secondLesson.getDayOfYear() - now.getDayOfYear()) + " dni");
        }

    }
}
