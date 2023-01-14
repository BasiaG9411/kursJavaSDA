package fundamentals;

public class IfStatement {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Positive case");
        } else {
            System.out.println("Negative case");
        }
        System.out.println("End of code execution");

        char input = 'o';
        System.out.println("input = " + input);
// a, o, u, i, e, y
        if ('a' == input) {
            System.out.println("it is a vowel");
        } else if (input == 'o') {
            System.out.println("it is a vowel = " + input);
        } else if (input == 'u') {
            System.out.println("it is a vowel");
        } else if (input == 'i') {
            System.out.println("it is a vowel");
        } else if (input == 'e') {
            System.out.println("it is a vowel");
        } else if (input == 'y') {
            System.out.println("it is a vowel");
        } else {
            System.out.println("it is not a vowel");
            
        }

        if (input == 'a' || input == 'o' || input == 'u' || input == 'i' || input == 'e' || input == 'y') {
            System.out.println("it is a vowel");
        } else {
            System.out.println("it is not a vowel");
        }
    }
}


