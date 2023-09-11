import java.util.*;

class Employee_1
{
    int basic_salary = 50000;
}

class PermanentEmp extends Employee_1
{
    int DA_P = basic_salary*150/100;
    void Displaydata()
    {
        System.out.println("Total salary of Permanent Employee is "+(DA_P+basic_salary));
    }
}

class TemporaryEmp extends Employee_1
{
    int  DA_T = basic_salary*80/100;
    void Showdata()
    {
        System.out.println("Total salary of Temporary Employee is "+(DA_T+basic_salary));
    }
}

public class Expt_4_3 {
    public static void main(String[] args) {
        TemporaryEmp T1 = new TemporaryEmp();
        PermanentEmp P1 = new PermanentEmp();
        P1.Displaydata();
        T1.Showdata();

    }
}
