// 7)	Write a program by creating an 'Employee' class having the following methods and print the final salary.
// i) - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
// ii) - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
// ii) - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.



import java.util.*;
public class Company{
    public static void main(String[] args) {

        Employee1 e1 = new Employee1();
        e1.getinfo();
        e1.AddSal();
        e1.AddWork();
        e1.Display();

    }
}

class Employee1{
    Scanner in = new Scanner(System.in);
    String name;
    int salary, hours;
    void getinfo()
    {
        System.out.println("Enter Name of Employee :");
        name = in.nextLine();
        System.out.println("Enter Salary :");
        salary = in.nextInt();
        System.out.println("Enter working Hours per day :");
        hours = in.nextInt();
    }

    void AddSal()
    {
        if (salary<500)
        {
            salary = salary+10;
        }
    }
    void AddWork()
    {
        if (hours>6)
        {
            salary = salary+5;
        }
    }
    void Display()
    {
        System.out.println("Salary of Employee "+name+" is :" +salary+" $.");
    }
}