// 3)	Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.

import java.util.*;

public class Roominfo {

    public static void main(String[] args) {

        room r1 = new room();
        room r2 = new room();
        r1.setdata();
        r1.displaydata(); 
        r2.setdata();
        r2.displaydata();    
    }  
}

class room{
    int roomno,roomarea;
    String roomtype,ACmachine;

    Scanner in = new Scanner(System.in);
    void setdata(){

        System.out.println("Enter room number :");
        roomno = in.nextInt();
        System.out.println("Enter room Area :");
        roomarea =in.nextInt();
        in.nextLine();
        System.out.println("Enter roomtype :");
        roomtype = in.nextLine();
        System.out.println("Enter ACmachine company name :");
        ACmachine = in.nextLine();
    }

    void displaydata(){
        System.out.println("Room number is :"+roomno);
        System.out.println("Room Area is :"+roomarea+" Sq. feet.");
        System.out.println("Room Type is :"+roomtype);
        System.out.println("AC machine company name is :"+ACmachine);
    }
}
