class Parent
{
    void show()
    {
        System.out.println("Showing Parent");
    }

    void add()
    {
        System.out.println("Addition");
    }
}

class Child extends Parent
{
    void show()
    {
        System.out.println("Showing Child");
    }
    void sub()
    {
        System.out.println("Subtraction");
    }
}
class Demo2
{
    public static void main(String args[])
    {
        Parent p=new Parent();
        p.show();
        p.add();

        Child c=new Child();
        c.show();
        c.add();
        c.sub();

        Parent p1=new Child();     //run time polymorphism
        p1.show();
        p1.add();
//        p1.sub();
    }
}
