package Exp_9_2010070;

import java.io.FileWriter;
import java.io.IOException;

public class FWDemo {

    public static void main(String[] args) throws IOException {

        String s= "Hello I am DHanraj....";
        int i=0;
        FileWriter fw = null;
        int l =s.length();
        try {
            fw = new FileWriter("A.txt");

        } catch (Exception e) {
            System.out.println(e);
        }
        while(i<l)
        {
            fw.write(s.charAt(i));
            ++i;
        }
        fw.close();
    }
}
