package fundamentals;

public class Excercise {
    public static void main(String[] args) {
        System.out.println("Hello, Basia!");

        System.out.println("/======================/");
        System.out.println("|                      |");
        System.out.println("|   Barbara Gryciuk    |");
        System.out.println("|     Grabowiec 44     |");
        System.out.println("|   17-204 Dubicze C.  |");
        System.out.println("|                      |");
        System.out.println("/======================/");

        int intValue = 200;
        System.out.println(intValue);

        double doubleValue = 3.548799624;
        System.out.println(doubleValue);

        char charValue = 'a';
        System.out.println(charValue);

        Integer integerObject = new Integer(intValue);
        System.out.println("integerObject = " + integerObject);

        String text = "Basia!";
        System.out.println("Hello " + text);

        String a = "/------------------/";
        System.out.println(a);
        String b = "|                  |";
        System.out.println(b);
        String imieNazwisko = "| Barbara Gryciuk  |";
        System.out.println(imieNazwisko);
        String adres = "|   Grabowiec 44   |";
        System.out.println(adres);
        String kod = "|17-204 Dubicze C. | ";
        System.out.println(kod);
        System.out.println(b);
        System.out.println(a);


        for (int k = 20; k > -21; k--) {
            System.out.println("Iteration number" + k);
        }

        System.out.println("===================================");
        for (int k = 30; k > -41; k--) {
            if (k % 3 == 0) {
                System.out.println(k);
            }
        }

        for (int k = -41; k < 30; k++) {
            if (k > -41 && k < -34) {
                System.out.print(k);
            }
        }

        System.out.println("=============================");

        for (int k = -41; k < 30; k++) {
            if (k == 5){
                System.out.println(k);
        }

    }
        System.out.println("=============================");

        for (int k = -41; k < 30; k++) {
            if (k != 5) {
                System.out.print(" " + k);
            }
        }
        System.out.println("=============================");

        int sum = 0;
        for (int k = -41; k < 30; k++) {
            sum += k;
        }
        System.out.print("Suma = " + sum);
}
    }







