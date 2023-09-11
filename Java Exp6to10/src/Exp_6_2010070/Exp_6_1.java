package Exp_6_2010070;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class Exp_6_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);


        System.out.println("Size of the the ArrayList is :"+list.size());

        Collections.sort(list);                                                        //Sorting ArrayList

        list.set(0,6);                                                                 //Update ArrayList

        System.out.println("Enter the number which position U want :");
        int n = in.nextInt();
        System.out.println("Position of number "+n+" is : "+list.indexOf(n));

        System.out.println("Enter the number to search :");
        int num = in.nextInt();
        System.out.println(" Is "+num+" present is Arraylist : "+list.contains(num));

        System.out.println("Enter the number that U want to remove :");
        int a = in.nextInt();
        list.remove(Integer.valueOf(a));                                                //Removing number using value
        System.out.println(a+" number is removed from ArrayList..");

//        list.remove(0);                                                           //Removing num using index

        //We can Also remove elements Using iterator it.remove()

        System.out.println("Printing Arraylist using Objects : ");
        System.out.println(list);                                                      //Method 1st

        System.out.println("Printing Arraylist using Iterator : ");
        Iterator it = list.iterator();
        while(it.hasNext())                                                           //Method 2nd
        {
            System.out.print(it.next()+" ");
        }

        System.out.println();
        System.out.println("Printing Arraylist using For-each loop : ");
        for(int i : list)                          //Method 3
        {
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Printing Arraylist using Enumerator : ");
        Enumeration e = Collections.enumeration(list);
        while(e.hasMoreElements())                                              //Method 4
        {
            System.out.print(e.nextElement()+" ");
        }

    }
}
