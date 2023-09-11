package Exp_9_2010070;

import java.io.FileOutputStream;
import java.io.IOException;

public class FoDemo {

    public static void main(String[] args) throws IOException {

        FileOutputStream fo=null;
        String msg= "Hello Messi is GOAT footballer.";
        try{
            fo=new FileOutputStream("B.txt");
        }catch(Exception e)
        {
            System.out.println(e);
        }

        byte[] b = msg.getBytes();
        fo.write(b);
        fo.close();
    }
}
