package tasks;

public class Arrays {
    private static final int NUM_OF_LETTER = 26;

    private static final int FIRST_LETTER = 'A';

    public static void main(String[] args) {
        char[] letters = new char[NUM_OF_LETTER];

        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < NUM_OF_LETTER; ++i) {
            letters[i] = (char) (FIRST_LETTER + i);
            System.out.println((i+1) + "th letter is : " + letters[i]);
        }
        for (int number : array) {
            System.out.println(number);
        }
    }
}
