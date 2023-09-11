class base
{
    int n ;
    void Show_data()
    {
        System.out.println("This is base class");
    }

}

class child_1 extends base {
    int n;
    child_1(int a,int b)
    {
        super.n = a;
        n = b;
    }
    void Show_data()
    {
        super.Show_data();
        System.out.println("Value of a in base class is :"+super.n);
        System.out.println("Value of a in child class is "+n);
    }

}

public class Expt_4_7 {
    public static void main(String[] args) {
        child_1 c1 = new child_1(30,50);
        c1.Show_data();

    }
}
