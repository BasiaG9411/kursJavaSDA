package fundamentals;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int c = a + b;
        System.out.println("a+b = " + c);

        System.out.println("c = " + c);
        
        c = a - b;
        System.out.println("c = " + c);
        c = a * b;
        System.out.println("c = " + c);
        c = b/a;
        System.out.println("c = " + c);
        
        c = a % b;
        System.out.println("c = " + c);

        System.out.println("a * b = " + c);

        int someVariable = 5;
        System.out.println(someVariable++);

        someVariable = 5;
        System.out.println(++someVariable);
        
        double d = 6.0;
        System.out.println("d = " + d);
        double e = 21.0;
        System.out.println("e = " + e);
        double f = e / d;
        System.out.println("e / d = " + f);


                

    }
}
