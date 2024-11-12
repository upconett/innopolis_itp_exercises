package tasks;

import java.util.Scanner;

public class StringEq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        String s1 = scanner.next();
        String s2 = scanner.next();

        String s3 = new String("This is a test String!");

        if (s1.equals(s2))
            System.out.println("S1 and S2 are equal!");
        else
            System.out.println("S1 and S2 are NOT equal...");

        if (s1.equals(s3))
            System.out.println("S1 and S3 are equal!");
        else
            System.out.println("S1 and S3 are NOT equal...");
    }
}
