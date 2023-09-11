package Exp_8_2010070;

class D implements Runnable{
    public void run()
    {
        System.out.println("Thread2 is running...........");
    }
}
public class Exp_8_4 extends Thread{

    public static void main(String[] args) {

        D d1 = new D();
        Thread t1 = new Thread(d1);
        Thread t = Thread.currentThread();
        System.out.println("Before setting Name :"+t.getName());

        t1.setName("Thread2");
        t.setName("Thread1");
        t1.start();

        t.setPriority(10);
        System.out.println("Priority of Thread1(main) :"+t.getPriority());

        t1.setPriority(6);
        System.out.println("Priority of Thread2:"+t1.getPriority());
    }
}
