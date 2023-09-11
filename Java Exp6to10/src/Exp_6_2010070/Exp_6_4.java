package Exp_6_2010070;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Exp_6_4 {

    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);

        System.out.println(s1);

        System.out.println("Element is popped :"+s1.pop());
        System.out.println("Element is popped :"+s1.remove(2));
        System.out.println(s1);
        System.out.println("Update Stack  at 2nd index :"+s1.set(2,70));
        System.out.println(s1);

        System.out.println("Is stack Empty :"+s1.isEmpty());

        System.out.println(" Check index of :"+s1.indexOf(10));

        System.out.println("Printing Stack By Iterator Method :");
        Iterator it = s1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        System.out.println("Printing Stack By Enumeration Method :");
        Enumeration e = Collections.enumeration(s1);
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }
    }
}
