package Stream;
import java.io.InputStream;
import java.io.*;

public class StreamIn {

    public static void main(String[] args) {
        InputStream is = null;
        String filename = "testFile.txt";

        try {
            is = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.err.println("couldn’t open file - fatal");
            System.exit(0);
        }

        //Nun lesen wir aus dem Stream.
        byte[] readBuffer = new byte[100];
        try {
            is.read(readBuffer);
        } catch (IOException ex) {
            System.err.println("couldn’t read data (fatal)");
            System.exit(0);
        }

        String readString = new String(readBuffer);
        System.out.println("read something: " + readString);
    }
}
