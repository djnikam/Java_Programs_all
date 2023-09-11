package Exp_9_2010070;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BWDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("Bf.txt");
        BufferedWriter bf = new BufferedWriter(fw);

        bf.write("Hello I am dhanraj");
        bf.newLine();
        bf.write("Studying in RIT",1,4);
        bf.flush();
        bf.close();
    }
}
