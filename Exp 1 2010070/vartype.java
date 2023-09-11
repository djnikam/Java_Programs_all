import java.util.*;

class vartype{

	static void add(){
		int a, b, sum;    
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter Two Numbers :");
		a=input.nextInt();
		b=input.nextInt();
	
		sum = a+b;
		System.out.println("Addition of two Numbers is :"+sum);
	}	

public static void main(String[] args){
Scanner input = new Scanner(System.in);

add();
}

}