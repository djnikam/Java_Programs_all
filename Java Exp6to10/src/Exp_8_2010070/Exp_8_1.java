package Exp_8_2010070;


class A8_1 extends  Thread{

    public void run()
    {
        try
        {
            for(int i=0;i<4;++i)
            {
                System.out.println("Thread is running from child.");
                sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

}

public class Exp_8_1 {

    public static void main(String[] args) throws InterruptedException {

        A8_1 a1 = new A8_1();
        a1.start();

        for(int i=0;i<4;++i)
        {
            System.out.println("Thread is running from Parent.");
            Thread.sleep(1000);
        }

    }
}
