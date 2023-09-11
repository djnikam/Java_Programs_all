import java.util.*;

class Parent
{
    static int bank_balance=1000;
    Scanner input = new Scanner(System.in);
    void Withdraw(int money)
    {
        bank_balance = bank_balance-money;
    }
    void Deposit(int money_1)
    {
        bank_balance = bank_balance+money_1;
    }
}
class child extends Parent
{

}

public class Expt_4_5 {
    public static void main(String[] args)
    {
        child c1 = new child();
        child c2 = new child();
        c1.Deposit(100);
        c1.Withdraw(500);
        c2.Deposit(2000);
        c2.Withdraw(1000);
        System.out.println(Parent.bank_balance);
    }
}
