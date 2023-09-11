import java.util.*;
public class Calculate_area7 {
    static double calculate_area(float side)
    {
        return side*side;
    }

    static double calculate_area(float base , float height)
    {
        return 0.5*base*height;
    }
    public static void main(String[] args)
    {
        float side,base,height;
        Scanner input = new Scanner(System.in);
        System.out.println("enter side of square");
        side = input.nextFloat();
        System.out.println("enter parameters of triangle i.e base and height");
        base = input.nextFloat();
        height = input.nextFloat();
        System.out.println("Area of the Square is : "+calculate_area(side)+" square meter");
        System.out.println("Area of the Triangle is : "+calculate_area(base,height)+" square meter");

    }
}
