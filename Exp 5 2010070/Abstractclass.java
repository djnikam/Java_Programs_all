// Take abstract class Animal with abstract method run(). The class Dog inherits the Abstract class Animal and do implementation of run method. In main class create the object of Dog to see the implementation of run method

abstract class Animala
{
    abstract void run();
}

class Doga extends Animala
{
    void run()
    {
        System.out.println("Dog is Running....");
    }
}
public class Abstractclass{
    public static void main(String[] args)
    {
        Doga D1 = new Doga();
        D1.run();
    }
}

