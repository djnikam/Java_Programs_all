package Exp_9_2010070;

import java.io.FileReader;
import java.io.IOException;

public class FRDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = null;

        try
        {
            fr = new FileReader("A.txt");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        int ch = fr.read();
        while (ch != -1) {
            System.out.print((char) ch);
            ch = fr.read();
        }

        fr.close();
    }
}
