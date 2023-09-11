package Exp_9_2010070;

import java.util.*;
import java.io.*;
//import.java.IOException;
public class Exp_9_3 {
    public static void main(String args[]){
        try{
            FileWriter f1=new FileWriter("A.txt",true);
            BufferedWriter bf=new BufferedWriter(f1);

            bf.write("Appending has been done with this");
            bf.newLine();
            bf.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

