package fundamentals;

public class IncrementationOperator {
    public static void main(String[] args){
        int a = 4;
        System.out.println("a = " + a);
        System.out.println("Pre-incrementation = " + ++a);

        int b = a++; // Post-incrementaation
        System.out.println("b = " + b);
        System.out.println("a value after incrementation = " + a);


    }

}
