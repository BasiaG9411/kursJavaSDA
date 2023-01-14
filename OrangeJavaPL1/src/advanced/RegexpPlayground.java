package advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpPlayground {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a+");
        Matcher matcher = pattern.matcher("aa");
        boolean result = matcher.matches();

        System.out.println("result = " + result);


        pattern = Pattern.compile("[A-Z][a-z]*");
        matcher = pattern.matcher("Jan");
        result = matcher.matches();

        System.out.println("result1 = " + result);


        pattern = Pattern.compile("[A-Z][a-z]");
        matcher = pattern.matcher("aa");
        result = matcher.matches();

        System.out.println("result = " + result);
    }
}
