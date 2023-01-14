package advanced;

public class VarArgsPlayground {
    public static void main(String[] args) {
        print("Ala", "ma", "kota");

        String[] wordsToPrint = new String[5];
        wordsToPrint[0] = "Ala";
        wordsToPrint[1] = "ma";
        wordsToPrint[2] = "kota";
        wordsToPrint[3] = "kot";
        wordsToPrint[4] = "ma";

        String[] wordsExtended = new String[6];
        // copy all elements from array wordsToPrint to array wordsExtended

        for (int i = 0; i < wordsToPrint.length; i++){
            wordsExtended[i] = wordsToPrint[i];
        }
        //adding last element
        printArray(wordsToPrint);


    }

    public static void print(String... words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

    public static void printArray(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}