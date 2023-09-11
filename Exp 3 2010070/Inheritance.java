class Super
{
    int a=10;
    void show()
    {
        System.out.println(a);
    }
}
class inheritance extends Super
{
    public static void main(String args[])
    {
        inheritance i=new inheritance();
        i.show();
        i.a=20;
        inheritance i1=new inheritance();
        i1.show();
    }
}
