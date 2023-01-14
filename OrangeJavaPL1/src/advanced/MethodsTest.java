package advanced;

public class MethodsTest {
    public static void main(String[] args) {
        {
            print();
            printName("John");
            printName("Bob");
            String fullName = getFullName("John", "Kowalski");
            System.out.println(fullName);
            printOnlyIfNotEven(3);
        }
    }

    // default access modifier - package private access

    static void print() {
        System.out.println("Hello World ");
    }

    static void printName(String name) {
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);
    }

    static String getFullName(String firstName, String surName) {
        String fullName = firstName + " " + surName;
        return fullName;
    }

    static void printOnlyIfNotEven(int number) {
        if (number % 2 == 0) {
            return;
        }
        System.out.println(number);
    }
}



