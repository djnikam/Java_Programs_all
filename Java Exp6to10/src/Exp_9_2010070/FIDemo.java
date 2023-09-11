package Exp_9_2010070;

import java.io.FileInputStream;
import java.io.IOException;

public class FIDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream fi=null;

        try
        {
            fi=new FileInputStream("B.txt");
        }catch (Exception e)
        {
            System.out.println(e);
        }

        int ch = fi.read();
        while(ch!=-1)
        {
            System.out.print((char)ch);
            ch=fi.read();
        }

        fi.close();
    }

}
