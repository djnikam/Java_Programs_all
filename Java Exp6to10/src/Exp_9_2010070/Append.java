package Exp_9_2010070;

import java.io.FileWriter;
import java.io.IOException;

public class Append {

    public static void main(String[] args) throws IOException {

        String s = "Data appended Successfully..";
        FileWriter fw =null;
        try{
            fw = new FileWriter("B.txt",true);
            fw.write(s);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        fw.close();
    }
}
