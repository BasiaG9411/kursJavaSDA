package Exercise19;

public class Exercise19 {
    public static void main(String[] args) {
        Author a1 = new Author();
        a1.setSurname("Mickiewicz");
        a1.setNationality("PL");

        Author a2 = new Author();
        a2.setSurname("Mass");
        a2.setNationality("US");

        Author a3 = new Author();
        a3.setSurname("Mróz");
        a3.setNationality("PL");

        Poem p1 = new Poem();
        p1.setCreator(a1);
        p1.setStropheNumbers(230);

        Poem p2 = new Poem();
        p2.setCreator(a2);
        p2.setStropheNumbers(120);

        Poem p3 = new Poem();
        p3.setCreator(a3);
        p3.setStropheNumbers(700);

        Poem[] tableOfPoems = new Poem[]{p1, p2, p3};
        int topStropheNumbers = 0;
        String topAuthor = "";

        for (Poem p : tableOfPoems) {
            if (p.getStropheNumbers() > topStropheNumbers) {
                topStropheNumbers = p.getStropheNumbers();
                topAuthor = p.getCreator().getSurname(); // p.getCreator() zwraca obiekt klasy Author

            }
        }
        System.out.println("Autor powieści z największą liczbą zwrotek to: " + topAuthor);
    }
}