    
    
import java.util.*;
public class Error{
    int c =23;
    static int d ;

    public static void main(String[] args) {
    
        Error e1 = new Error();
        System.out.println(e1.c);
        System.out.println(d);
        e1. Add();
        Error e2 = new Error();
        e2.c = 3;
        System.out.println(e2.c);
        e2.d = 50;
        System.out.println(d);
        
    }

    void Add(){
        int sum,  a=10, b=3;
        sum = a+b;
        System.out.println(sum);
        System.out.println(d);
    }
}

