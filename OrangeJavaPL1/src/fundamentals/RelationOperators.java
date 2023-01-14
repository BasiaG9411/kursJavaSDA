package fundamentals;

public class RelationOperators {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;

        boolean result = a == b;

        System.out.println("a == b " + result );
        
        result = a != b;
        System.out.println("a != b = " + result);

        result = a > b;
        System.out.println("a > b = " + result);

        result = a < b;
        System.out.println("a < b = " + result);

        result = (a <= b);
        System.out.println("a <= b = " + result);

    }
}
