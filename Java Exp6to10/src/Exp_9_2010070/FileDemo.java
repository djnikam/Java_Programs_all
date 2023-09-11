package Exp_9_2010070;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File f = new File("f1.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());

        String path = f.getAbsolutePath();
        System.out.println(path);

        System.out.println(f.getName());

        System.out.println(f.length());
        f.delete();
        System.out.println(f.exists());

        File f1 = new File("DemoDIr");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());

        File f2 = new File("DemoDIr","A.txt");
        f2.createNewFile();
        System.out.println(f2.exists());
    }
}