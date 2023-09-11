// Problem Statements1: Constructor
// -	Demonstrate the default constructor
// -	Demonstrate the parameterized constructor
// -	Demonstrate the Constructor Chaining In Java
// 	Within same class: It can be done using this() keyword for constructors in same class
// 	From base class: by using super() keyword to call constructor from the base class.
    
    
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class constructor_1{
    public static void main(String[] args) {
    
    Two_wheelers t1 = new Two_wheelers();
    Four_wheelers f1 = new Four_wheelers(2228, "Bugati");    
    }
}

class Vehicles
{
    Vehicles()
    {
        System.out.println("This is Parent class.");
    }  
}

class Two_wheelers extends Vehicles{

    Two_wheelers()
    {
        // super();
        int model_no;
        System.out.println("This is child class.");
    }
}

class Four_wheelers extends Vehicles{
    Four_wheelers(int x, String z)
    {
        System.out.println("Name of four wheeler is :"+z);
        System.out.println("Four wheeler Numberis :"+x);
    }
}

