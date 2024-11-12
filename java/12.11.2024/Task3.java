import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;


public class Task3{
    public static void main(String[] args) throws 
        IOException, NoSuchElementException, 
        IllegalStateException, ArithmeticException 
    {
        try(
            InputStream in = new FileInputStream("input.txt");
            Scanner scan = new Scanner(in);
        ) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a / b);
        } catch (
            IOException |
            NoSuchElementException | 
            IllegalStateException |
            ArithmeticException
            ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }   
}

