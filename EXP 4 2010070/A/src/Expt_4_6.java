class animal
{
    animal()
    {
        System.out.println("This is Base class constructor ");
    }
    animal(String s1)
    {
        System.out.println(s1);
    }
}
class cat extends animal {
    cat()
    {
        super("Hello");
        System.out.println("This is child class constructor");
    }
}
class dog extends animal{

    dog()
    {
        super();
        System.out.println("This is 2 nd child class constructor");
    }
}

public class Expt_4_6 {
    public static void main(String[] args) {
        cat c1 = new cat();
        dog c2 = new dog();
    }
}
