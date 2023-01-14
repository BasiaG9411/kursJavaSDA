package fundamentals;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean boolValue1 = true;
        System.out.println("boolValue1 = " + boolValue1);
        boolean boolValue2 = false;
        System.out.println("boolValue2 = " + boolValue2);

        System.out.println("&& operator");
        boolean result = boolValue1 && boolValue2;
        System.out.println("result true && false = " + result);

        result = boolValue1 && boolValue1;
        System.out.println("result true && true = " + result);

        System.out.println("|| operator");
        result = true || false;
        System.out.println("result true || false = " + result);
        result = false || false;
        System.out.println("result false || false = " + result);

        System.out.println("! operator");
        result = !true;
        System.out.println("result !true = " + result);


    }
}
