package Exp_8_2010070;

class E extends Thread
{
    @Override
    public void run()
    {
    }
    public void Gm()
    {
            System.out.println("Good Morning");
    }
    public void Department()
    {

            System.out.println("TY-CSIT");
    }

}
public class Exp_8_5 {

    public static void main(String[] args)
    {
        E e1 = new E();
        E e2 = new E();
        e1.start();
        e1.Gm();
        e2.start();
        e2.Department();

    }
}
