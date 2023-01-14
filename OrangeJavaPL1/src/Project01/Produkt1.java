package Project01;

public class Produkt1 {
    public static void main(String[] args) {
        Product p1 = new Product("Śmietana", "Nabiał", 18, 200);

        double calculateAverageGrade = p1.getSumOfGrades() / p1.getCountOfGrades();
        System.out.println(calculateAverageGrade);

    }
}
