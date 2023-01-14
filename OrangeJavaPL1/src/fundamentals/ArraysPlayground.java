package fundamentals;

public class ArraysPlayground {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[5]; // creation of a new array of size 5

        int[] secondInArray = new int[]{1, 2, 3, 4};

        String[] strings = new String[5];


        strings[0] = "Jim";
        strings[4] = "Michael";
        strings[1] = "Dweight";

        String name = strings[4];
        System.out.println("name = " + name);
        String nameUpperCase = name.toUpperCase();
        System.out.println("nameUpperCase = " + nameUpperCase);
     for (int i = 0; i < strings.length; i++) {
     }
}
}

