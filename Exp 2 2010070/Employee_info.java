// 6)	Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
// Name        Year of joining        Address
// Robert            1994                64C- WallsStreat
// Sam                2000                68D- WallsStreat
// John                1999                26B- WallsStreat


import java.util.*;
public class Employee_info {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.getinfo();
//        e2.getinfo();
//        e3.getinfo();
        System.out.println("Name        Year of joining          Address  ");
        e1.display();
//        e2.display();
//        e3.display();
    }
}

class Employee{
    String name,address;
    int year;
    Scanner in = new Scanner(System.in);
    void getinfo(){

     System.out.println("Enter Name of Employee :");
     name = in.nextLine();
     System.out.println("Enter Address of Employee :");
     address = in.nextLine();
     System.out.println("Enter Year of joining of Employee :");
     year = in.nextInt();
    }
    void display()
    {
        System.out.printf("%-10s%20d%50s",name,year,address );
        System.out.println();
    }

}