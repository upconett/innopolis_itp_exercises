import java.io.*;


public class Task1 {
    public static void main(String[] args) {
        try (
            InputStream in = new FileInputStream("input.txt");
            OutputStream out = new FileOutputStream("output2.txt");
        ) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
