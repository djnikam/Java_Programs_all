package Exp_8_2010070;

class C extends Thread
{
    @Override
    public void run() {
        for(int i= 0;i<5;++i)
        {
            System.out.println("child Thread");
            System.out.println(getState());
        }
    }
}

public class Exp_8_6 {
    public static void main(String[] args)
    {
        C c1 = new C();
        C c2 = new C();
        c1.start();
        System.out.println(c1.getState());
        System.out.println(c2.getState());
        c1.run();

        c1.stop();
        System.out.println(c1.getState());

    }
}