    
    
import java.util.*;
public class Holiday_4{
    public static void main(String[] args) {
    
        Holiday h1 = new Holiday("Diwali",24,"October");

    }
}

class Holiday{
    private String name;
    private int day;
    private String month;

    Holiday(String nm,int d, String mn)
    {
        name =nm;
        day = d;
        month= mn;      
    }

    public boolean inSamemonth(Holiday hol)
    {
        return this.month.equals(hol.month);
    }
}