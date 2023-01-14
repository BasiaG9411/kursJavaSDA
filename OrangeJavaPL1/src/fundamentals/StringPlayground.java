package fundamentals;

public class StringPlayground {
    public static void main(String[] args) {
        int integer = 5;
        String text = "Hello String";
        System.out.println("text = " + text);

        String text1 = new String("Hello String");
        System.out.println("text1 = " + text1);
        
        boolean result = text1 == text;
        System.out.println("result text == text1 = " + result);

        result = text.equals(text1);
        System.out.println("result text.equals(text1) = " + result);

        String text2 = text1.intern();
        result = text == text2;
        System.out.println(result);


        System.out.println("String immutability presentation");

        String have = "ma";
        have.toUpperCase();
        System.out.println(have);

        String ala = "ala";
        String alaUpperCase = ala.toUpperCase();
        System.out.println(ala);
        System.out.println(alaUpperCase);


        String kot = "KOT";
        kot = kot.toLowerCase();
        System.out.println(kot);

        System.out.println("Strings concatenation");

        String val = "Polska gola";
        String val1 = " taka jest kibiców wola";


        String res = val + val1;
        System.out.println(res);

        String res1 = val.concat(val1);
        System.out.println(res1);

        System.out.println("String methods");
        
        String val3 = "Some text";
        
        int length = val3.length();
        System.out.println("length = " + length);

        System.out.println("length = " + val3.length());

        System.out.println(val3.toUpperCase());

        int indexOfS = val3.indexOf('S');
        System.out.println("indexOfS = " + indexOfS);

        int indexOfTe = val3.indexOf("te");
        System.out.println("indexOfTe = " + indexOfTe);






    }
}
