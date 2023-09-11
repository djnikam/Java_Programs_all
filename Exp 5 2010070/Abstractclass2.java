// Take abstract class Animal with abstract method MakeSound() and non abstract method eat() with its implementation.  The class Dog inherits the Abstract class Animal and do implementation of MakeSound method. In main class create the object of Dog to see the implementation of run method and MakeSound Method

abstract class Animal{
    abstract void Makesound();
    void eat()
    {
        System.out.println("Animal is eating.....");
    }
}

class Dog extends Animal{
    void Makesound()
    {
        System.out.println("Barking... ");
    }
}

public class Abstractclass2
{
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.Makesound();;
        d1.eat();
    }
}