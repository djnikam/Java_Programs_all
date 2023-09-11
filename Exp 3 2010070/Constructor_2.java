// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. create 2 objects of class Student and initialize the Students objects by parametrized constructor. And Display the information of both students
  
    
import java.util.*;
public class Constructor_2{
    public static void main(String[] args) {

    System.out.println("Information of Students :");
    Student s1 = new Student("Dhanraj",2010070);
    Student s2 = new Student("Shubham", 2010055);
        
    }
}

class Student{
    Student(String name ,int roll_no)
    {
        System.out.println("Name is :"+name);
        System.out.println("Roll no is :"+roll_no);
    }
}