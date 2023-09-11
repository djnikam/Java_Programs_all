// 2)	Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard

import java.util.*;

public class Rectangle {

    public static void main(String[] args) {
  
        Area a1 = new Area();
        a1.setDim();
        System.out.println("Area of rectangle is :"+a1.getArea());
    }   
}

class Area{

    float breadth, length, area;
    Scanner in = new Scanner(System.in);
    void setDim(){
       
        System.out.println("Enter the breadth and length :");
        breadth = in.nextInt();
        length = in.nextInt();
    }
    float getArea()
    {
      area = length*breadth;
      return area;
    }
}
