package Exp_6_2010070;

import java.util.*;

public class Exp_6_7 {

    public static void main(String[] args) {

        HashMap<Integer,String> h1 = new HashMap<Integer,String>();

        h1.put(1,"Dhanraj");
        h1.put(2,"Shubham");
        h1.put(3,"Sujit");
        h1.put(4,"Yash");
        h1.put(5,"Ganesh");

        System.out.println(h1);
        h1.remove(1);

//         h1.replace(2,);

        System.out.println(h1);

        for(Map.Entry m : h1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
