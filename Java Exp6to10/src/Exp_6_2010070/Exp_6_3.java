package Exp_6_2010070;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Exp_6_3 {

    public static void main(String[] args) {

        Vector<String> s1 = new Vector<String>();

        s1.add("Dhanraj");
        s1.add("Sujit");
        s1.add("Shubham");
        s1.add("Onkar");
        s1.add(1,"Yash");


        System.out.println("Size of Vector is : "+s1.size());

        System.out.println(s1);                                 //Display By Object

        Collections.sort(s1);                                   //Sorting Vector

        s1.set(3,"Bhushan");

        System.out.println("Index of Dhanraj is :"+s1.indexOf("Dhanraj")); // find position

       //   check presence
        System.out.println("Is Vector contains Onkar : "+s1.contains("Onkar"));

        //Remove the Element from Vector

        System.out.println("Remove Dhanraj Element :"+s1.remove("Dhanraj"));

        Iterator it = s1.iterator();                           //Iterator Method
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        System.out.println("Printing Arraylist using Enumerator : ");
        Enumeration e = s1.elements();
        while(e.hasMoreElements())                                              //Method 4
        {
            System.out.print(e.nextElement()+" ");
        }
    }


}
