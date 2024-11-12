package tasks;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();    // read until space
        String word = scanner.next(); // read until space
        String sentance = scanner.nextLine(); // read until \n
        scanner.close();

        System.out.println(a);
        System.out.println(word);
        System.out.println(sentance);
    }
}
