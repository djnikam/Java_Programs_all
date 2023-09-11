// 5)	Write a program to
// -create the Class Bank with the static variable balance with initial value as 500 and two methods Deposit () and Withdraw ()
// - Create 3 objects of class for three family members.
// - and have the shared transaction on shared bank account.
// -check the mini balance is 100 Rs. While withdrawing.

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Banking {

    public static void main(String[] args) {

    Bank b1,b2,b3;
    b1 = new Bank();
    b2 = new Bank();
    b3 = new Bank();

    b1.deposit();
    b2.withdraw();
    b3.deposit();
    b1.withdraw();
    b3.withdraw();
    }
}

class Bank{

    static float balance = 500;

    Scanner in = new Scanner(System.in);
    float Dep_amt, With_amt;
    void deposit(){
        System.out.println("Enter Amount to Depost :");
        Dep_amt = in.nextFloat();
        balance = balance + Dep_amt;
        System.out.println("Total Balnce is :"+balance);
    }
    void withdraw(){
        System.out.println("Enter Amount to Withdraw :");
        With_amt = in.nextFloat();
        if(balance-With_amt<100)
        {
            System.out.println("You cant withdraw minimum balance should be 100!!!");
        }
        else
        {
            balance =balance-With_amt;
            System.out.println("Total Balnce is :"+balance);
        }
    }
}
