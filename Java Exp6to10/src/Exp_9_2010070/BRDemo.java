package Exp_9_2010070;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BRDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("Bf.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
        fr.close();
    }
}
