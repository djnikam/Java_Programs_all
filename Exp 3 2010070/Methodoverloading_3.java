// Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.   
    
import java.util.*;
public class Methodoverloading_3{
    public static void main(String[] args) {
    Print p = new Print();
    String[] a = {"nikhil", "dhanraj", "shubham"};
    int[] b = {1,2,3,4,5};
    
    p.printarray(a);
    p.printarray(b);
    }
}

class Print{
    void printarray(String[] array){
        for(String i: array)
            System.out.print(i + " ");
    }
    void printarray(int[] array){
        for(int i: array)
            System.out.print(i + " ");
    }
}