package tasks;

import java.util.Scanner;

public class Fifth {
    private static final char[] vovels = "eyuioa".toCharArray();

    private static int countVovels(String str) {
        int result = 0;
        for (char letter : str.toCharArray())
            for (char vovel : vovels)
                if (letter == vovel) result++;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        String str = sc.nextLine(); sc.close();
        System.out.println(countVovels(str));
    }
}
