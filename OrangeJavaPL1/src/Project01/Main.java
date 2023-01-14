package Project01;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    static void addProduct(Product[] tab) {
        int position = -1;
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == null) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Brak miejsca w tabeli");
        } else {
            System.out.println("Podaj nazwę produktu: ");
            String name = userInput.nextLine();
            System.out.println("Podaj nazwę kategorii: ");
            String category = userInput.nextLine();
            System.out.println("Podaj ilość ocen: ");
            int totalGrades = userInput.nextInt();
            System.out.println("Podaj sumę ocen: ");
            double sumOfGrades = userInput.nextDouble();
            tab[position] = new Product(name, category, totalGrades, sumOfGrades);
        }
        }

        static void setUnavailable(Product[] tab) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Podaj idx wycofywanego produktu: ");
            int idx = userInput.nextInt();

            if ((idx >= 0 && idx < tab.length) && tab [idx] != null) {
                tab[idx].setAvailable(false);
            } else {
                System.out.println("Podano błędny indeks lub produkt nie istnieje");
            }
        }


    static void showProducts(Product[] tab) {
    for (Product p : tab) {
        if (p != null && p.isAvailable()) {
            System.out.println("Nazwa: " + p.getName() + " Kategoria: " + p.getCategory() + " Ilość ocen: " + p.getCountOfGrades() + " Suma ocen: " + p.getSumOfGrades());
        }
    }
        System.out.println();

    }

    static void deleteProducts(Product[] tab) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj idx usuwanego produktu: ");
        int idx = userInput.nextInt();

        if (idx >= 0 && idx < tab.length) {
            tab[idx] = null;
        } else {
            System.out.println("Podano błędny indeks");
        }
    }
    static void setAvgGradeAll(Product [] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == null) {
                tab[i].calculateAvgGrade();
            }
        }
        }
    static void showTopProduct(Product[] tab) {
        setAvgGradeAll(tab);
        double topProduct = 0.0;
        int topIdx = -1;

        for (int i = 0; i < tab.length; i ++) {
            if (tab[i] != null && tab[i].getAvgGrade() > topProduct) {
                topIdx = i;
                topProduct = tab[i].getAvgGrade();
            }
        }
        if (topIdx == -1) {
            System.out.println("Nie znaleziono produktu");
        } else {
            System.out.println("Top produkt to: " + tab[topIdx].getName());
        }
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        Product[] tableOfProducts = new Product[10];

        String option = "";

        while (!option.equals("exit")) {
            System.out.println("Podaj opcję: ");
            option = userInput.nextLine().toLowerCase();

            switch (option) {
                case "add":
                    addProduct(tableOfProducts);
                    break;
                case "delete":
                    deleteProducts(tableOfProducts);
                    break;
                case "show":
                    showProducts(tableOfProducts);
                    break;
                case "top" :
                    showTopProduct(tableOfProducts);
                    break;
                case "disable":
                    setUnavailable(tableOfProducts);
                    break;
                case "exit":
                    System.out.println("Dziękuję za skorzystanie z programu");
                    break;
                default:
                    System.out.println("Nie rozpoznano opcji");



            }
        }
    }
}
