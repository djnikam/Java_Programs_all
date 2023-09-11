import java.util.*;

class Employee
{
    int salary ;
    Scanner input = new Scanner(System.in);
    void get_salary()
    {
        System.out.println("enter the salary : ");
        salary = input.nextInt();
    }
}

class Programmer extends Employee
{
    int bonus = 2000;
    void Show_Salary()
    {
        System.out.println("Total salary is : "+(salary+bonus)+" Rs");
    }

}

public class Expt_4_1 {
    public static void main(String[] args)
    {
        Programmer p1 = new Programmer();
        p1.get_salary();
        p1.Show_Salary();

    }
}

