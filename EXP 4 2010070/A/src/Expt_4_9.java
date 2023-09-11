class Bank
{
void GetRateOfInterest()
{
    float interest_rate = 10;
    System.out.println("Default Bank Interest rate is :"+interest_rate+"%");
}
}
class SBI extends Bank{
    void GetRateOfInterest()
    {
        float interest_rate = 8;
        System.out.println("SBI Bank Interest rate is :"+interest_rate+"%");
    }

}
class ICICI extends Bank
{
    void GetRateOfInterest()
    {
        float interest_rate = 7;
        System.out.println("ICICI Bank Interest rate is :"+interest_rate+"%");
    }

}
class AXIS extends Bank{
    void GetRateOfInterest()
    {
        float interest_rate = 9;
        System.out.println("AXIS Bank Interest rate is :"+interest_rate+"%");
    }

}

public class Expt_4_9 {
    public static void main(String[] args)
    {
        Bank b1 = new Bank();
        SBI s1 = new SBI();
        ICICI i1 = new ICICI();
        AXIS a1 = new AXIS();
        Bank b2 = new SBI();
        b1.GetRateOfInterest();
        s1.GetRateOfInterest();
        i1.GetRateOfInterest();
        a1.GetRateOfInterest();
        b2.GetRateOfInterest();
    }
}

