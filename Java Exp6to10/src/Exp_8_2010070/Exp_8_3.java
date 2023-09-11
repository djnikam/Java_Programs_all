package Exp_8_2010070;

class B extends Thread{
    public void run()
    {
        System.out.println("Thread is running......");
    }
}

public class Exp_8_3 {

    public static void main(String[] args) {

        B b1 = new B();
        b1.start();
    }
}
