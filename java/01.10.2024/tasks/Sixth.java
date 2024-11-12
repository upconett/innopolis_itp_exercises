package tasks;

import java.util.Scanner;

public class Sixth {

    private static double fahrToCels(double fahr) {
        return (fahr - 32) * 5/9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahr = sc.nextDouble(); sc.close();

        System.out.println("Celsius: " + fahrToCels(fahr));
    }
}
