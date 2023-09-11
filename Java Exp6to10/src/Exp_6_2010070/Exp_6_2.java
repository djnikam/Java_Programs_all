package Exp_6_2010070;

import java.util.LinkedList;

public class Exp_6_2 {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();

        l1.addFirst(10);
        l1.addLast(20);
        l1.addFirst(5);
        l1.addLast(30);
        l1.add(40);
        l1.add(4, 35);


        System.out.println(l1);    //Print by Object

         //Find object
        System.out.println("Index of Element is "+ l1.indexOf(35));

        System.out.println("First element in List is :"+l1.getFirst());
        System.out.println("Last element in list is :"+l1.getLast());

        System.out.println("First element in List is "+l1.getFirst()+" removed :"+l1.removeFirst());
        System.out.println("First element in List is "+l1.getLast()+" removed :"+l1.removeLast());

        System.out.println("Element at particular index in List is "+l1.get(1)+" removed :"+l1.remove(1));

        //Check Presence in Linked list
        System.out.println(l1.contains(35));

    }
}
