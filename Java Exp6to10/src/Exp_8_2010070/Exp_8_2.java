package Exp_8_2010070;


class A implements Runnable
{
    public void run ()
    {
        System.out.println("Thread is running.......");
    }
}
public class Exp_8_2 {

    public static void main(String[] args) {

        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}
