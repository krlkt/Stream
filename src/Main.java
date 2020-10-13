import java.io.*;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            String filename = "testFile.txt";
            OutputStream os = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            System.err.println("couldn’t open file - fatal");
            System.exit(0); // brutal exception handling
        }
    }
}
