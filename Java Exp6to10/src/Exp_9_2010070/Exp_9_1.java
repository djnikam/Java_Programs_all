package Exp_9_2010070;

import java.io.*;

class Exp_9_1
{
    public static void main(String args[]) throws IOException
    {
        FileWriter f1 = new FileWriter("A.txt");
        BufferedWriter buff = new BufferedWriter(f1);

        buff.write("Hello I am Dhanraj Nikam");
        buff.newLine();

        buff.write("I am from CSIT Department",0,16);
        buff.flush();
        buff.close();
    }
}
