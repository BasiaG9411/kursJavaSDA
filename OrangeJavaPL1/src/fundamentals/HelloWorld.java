package fundamentals;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int value; // variable declaration
        value = 6; // variable initialization

        System.out.println(value);

        final int otherValue = 9;

        System.out.println(otherValue);


        byte byteValue = 127;
        System.out.println(byteValue);
        short shortValue = 32000;
        System.out.println("shortValue = " + shortValue);
        System.out.println(byteValue);
        int intValue = 1236597;

        float floatValue = 0.0001F;
        System.out.println("floatValue = " + floatValue);

        double doubleValue = 0.0001;
        System.out.println("doubleValue = " + doubleValue);

        System.out.println(doubleValue);

        boolean trueValue = true;
        System.out.println("trueValue = " + trueValue);

        boolean falseValue = false;
        System.out.println("falseValue = " + falseValue);

        char charValue = 't' ;
        System.out.println(charValue);

        char charValueLineEnd = '\n';
        System.out.println(charValueLineEnd);

        String text = "Some text \n new line";
        System.out.println(text);

    }
}
