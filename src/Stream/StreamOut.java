package Stream;

import java.io.*;

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

        DataOutputStream dos = new DataOutputStream(os);
        try {
            dos.writeInt(42);
        } catch (IOException ex) {
            System.err.println("couldn’t write data (fatal)");
            System.exit(0);
        }

        PrintStream ps = new PrintStream(os);
        ps.println("Hello Stream");

    }
}

