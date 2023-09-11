//Using this keyword
// 1) We can pass argument to constructor using this keyword 
// 2) this reffers to parrent class and create diff betn instance and local variable

    
import java.util.*;
public class This_1B{
    public static void main(String[] args) {
    
        child10 c1 = new child10(10);

    }
}

class child10 extends This_1B{
    child10(){
        System.out.println("This constructor called by this keyword");
    }

    child10(int x)
    {
        this();
        System.out.println(x);
    }
}