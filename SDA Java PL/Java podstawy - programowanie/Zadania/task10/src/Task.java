import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String polidrome = scanner.nextLine();

String a = polidrome.toLowerCase().replace(" ", ""); //replace - zastąpienie
        StringBuffer sb = new StringBuffer(a);
        sb.reverse();
        //System.out.println(sb);


        String second = a.equals(sb.toString()) ? "true" : "false";//sb jest obiektem i dlatego musimy go przypisać do Stringa
        System.out.println(second);
    }
}