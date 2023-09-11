// 4)	Java program which creates Stakeholder class as a main class and create two other classes such as faculty and student. Read the details of faculty and students in main, pass these details to method defined in respective class, print those details.


import java.util.*;

public class Stakeholder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Faculty_nm, Stu_nm;
        int Fac_age, Stu_age;
        System.out.println("Enter Faculty Name :");
        Faculty_nm = in.nextLine();
        System.out.println("Enter Student Name :");
        Stu_nm = in.nextLine();
        System.out.println("Enter Fcaulty age :");
        Fac_age = in.nextInt();
        System.out.println("Enter Student age :");
        Stu_age = in.nextInt();

        Student s1 = new Student();
        Faculty f1 = new Faculty();
        s1.display(Stu_nm, Stu_age);
        f1.display(Faculty_nm, Fac_age);
    }   
}

class Student{

    void display(String s_nm,int s_age){

        System.out.println("Student name is :"+s_nm);
        System.out.println("student age is :"+s_age);
    }
}

class Faculty{

    void display(String f_nm,int f_age){
        System.out.println("Student name is :"+f_nm);
        System.out.println("student age is :"+f_age);
    }
}
