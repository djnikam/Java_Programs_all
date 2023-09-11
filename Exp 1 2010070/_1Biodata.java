// 1)	Implement the java program to print your Biodata.
import java.util.*;

public class _1Biodata {
    public static void main(String[] args) {

        int age;
        char Bloodgroup;
        String name, Address, mobno;

        Scanner input =new Scanner(System.in);
        System.out.println("\nEnter Your Name :");
        name = input.nextLine();
        System.out.println("\nEnter Your Address :");
        Address = input.nextLine();
        System.out.println("\nEnter Your Mobile Number:");
        mobno = input.nextLine();
        System.out.println("\nEnter Your Bloodgroup :");
        Bloodgroup = input.next().charAt(0);
        System.out.println("\nEnter Your  Age:");
        age = input.nextInt();

        System.out.println("Biodata is :\n");
        System.out.println("Name :"+name);
        System.out.println("Bloodgrouop :"+Bloodgroup);
        System.out.println("Address :"+Address);
        System.out.println("Age :"+age);
        System.out.println("mobile No. :"+mobno);
    }
}
