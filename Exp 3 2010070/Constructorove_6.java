// Implement a java program to demonstrate the method overloading concept


class Account
{
   int account_no,balance;
   String b_date;
   void create_account()
   {
       account_no= 1000;
       balance=500;
       b_date = "1-1-2010";

   }
   void create_account(int account_no,int balance)
   {
       this.account_no = account_no;
       this.balance = balance;
       this.b_date = "1-1-2010";
   }
   void create_account(int account_no,int balance,String b_date)
   {
        this.account_no =account_no;
        this.balance = balance;
        this.b_date =b_date;
   }
   void ShowData()
   {
       System.out.println("Account no is : "+account_no);
       System.out.println("Balance is : "+balance);
       System.out.println("Birthdate is : "+b_date);
   }

}
public class Constructorove_6 {
    public static void main(String[] args) {
        Account a1= new Account();
        Account a2= new Account();
        Account a3= new Account();
        a1.create_account();
        a2.create_account(1001,1000);
        a3.create_account(1002, 99999999, "31-10-2002");
        a1.ShowData();
        a2.ShowData();
        a3.ShowData();
    }
}
