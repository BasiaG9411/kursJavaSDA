package fundamentals;

public class Loops {
    public static void main(String[] args) {
        System.out.println("For loops");

        for (int i = 0; i < 4; i++) {
            System.out.println("Iteration number" + i);
        }

        System.out.println("=======================");

        for (int i = 0; i > -10; i--) {
            System.out.println("Iteration number" + i);
        }

        System.out.println("While loop");

        int i = 0;
        while (i < 10) {
            System.out.println("Iteration number " + (i + 1));
            i++;
        }

        System.out.println("Do While loop");

        int index = 0;
        do {
            System.out.println("Iteration number" + (index + 1));
            ++index;
        } while (index < 10);

        System.out.println("rest of the code");




    }
}

