package Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamOut {
    public static void main(String[] args) {
        OutputStream os = null;

        try {
            String filename = "testFile.txt";
            os = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            System.err.println("couldn’t open file - fatal");
            System.exit(0); // brutal exception handling
        }

        String someText = "Hallo World!";
        byte[] textAsByte = someText.getBytes();
        try {
            os.write(textAsByte);
        } catch (IOException ex) {
            System.err.println("couldn’t write data (fatal)");
            System.exit(0);
        }
    }
}

