package Exp_9_2010070;

import java.io.*;
class Exp_9_2 {
    public static void main(String args[]) throws IOException {
        FileReader f = new FileReader("A.txt");
        BufferedReader b = new BufferedReader(f);

        int i;
        i = b.read();

        while (i != -1) {
            System.out.print((char) i);
            i = b.read();
        }

//        //Second Method
//        String msg;
//        msg=b.readLine();
//        System.out.println(msg);

        b.close();
        f.close();
    }
}