package tasks;

public class Eighth {
    private static int charToInt(char c) {
        int i = (int) c;
        if (i < 65) return i - 48;
        else        return i - 55;
    }

    private static int smthToDec(String smth, int base) {
        int result = 0;
        int i = 0;
        while (i < smth.length()) {
            result += (
                charToInt(smth.charAt(i)) * Math.pow(base, smth.length()-i-1));
            i++;
        }
        return result;
    }

    private static String decToBin()

    public static void main(String[] args) {
        String bin = "000101";
        System.out.println(smthToDec(bin, 2));
    }
}
