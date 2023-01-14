package exercises;

public class VowelCounter {

    private String text;

    public VowelCounter(String text) {
        this.text = text;
    }

    public int calculateVowels() {
        if (text == null){
            return 0;
        }
        int counter = 0;
        String lowerCase = text.toLowerCase();
        char[] chars = lowerCase.toCharArray();
        for (char input : chars) {
            if (input == 'a' || input == 'o' || input == 'u' || input == 'i' || input == 'e' || input == 'y') {
                counter++;
            }
        }
        return counter;

    }
}
