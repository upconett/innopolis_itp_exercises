package tasks;

public class ImplCast {

    private static final int NUM_OF_LETTER = 26;

    private static final int FIRST_LETTER = 'A';

    public static void main(String[] args) {
        char c = 'a';
        int ascii = c; // 97 - thats risky
        int explicit = (int) c; // 97   

        System.out.println(c);
        System.out.println(ascii);
        System.out.println(explicit);
    }
}
