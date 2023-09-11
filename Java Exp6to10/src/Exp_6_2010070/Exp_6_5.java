package Exp_6_2010070;

import java.util.TreeSet;

public class Exp_6_5 {

    public static void main(String[] args) {

        TreeSet<Integer> t1 = new TreeSet<Integer>();

        t1.add(10);
        t1.add(2);
        t1.add(5);
        t1.add(10);
        t1.add(20);

        System.out.println(t1);

        System.out.println("Total elements : "+t1.size()); //total elements :

        System.out.println("Lowest (First) element is :"+t1.first());
        System.out.println("Highest (Last) element is :"+t1.last());

        t1.pollFirst();          // t1.remove(t1.first());
        t1.pollLast();

        t1.add(2);
        t1.add(15);
        t1.add(20);

        System.out.println("Treeset :"+t1);

        System.out.println("Headset :"+t1.headSet(15));
        System.out.println("Tailset :"+t1.tailSet(15));
        System.out.println("Subset :"+t1.subSet(5,20));
    }

}
