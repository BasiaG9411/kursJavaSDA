package advanced;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePlayground {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        System.out.println(now.format(DateTimeFormatter.RFC_1123_DATE_TIME));


    }
}
