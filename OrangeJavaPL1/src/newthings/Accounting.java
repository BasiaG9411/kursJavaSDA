package newthings;

import java.sql.SQLOutput;

public class Accounting {
    public static void main(String[] args) {
        Person bob = new Person ("Bob", "PM", 15000);
        System.out.println("bob = " + bob);

        PersonRecord ted = new PersonRecord("Ted", "Developer", 20000);
        System.out.println("ted = " + ted);
        System.out.println("ted.name() = " + ted.name());
    }
}
