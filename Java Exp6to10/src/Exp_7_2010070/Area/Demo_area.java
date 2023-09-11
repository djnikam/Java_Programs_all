package Exp_7_2010070.Area;

public class Demo_area {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        Square s1 = new Square();
        System.out.println(c1.Area_C(7));
        System.out.println(r1.Area_r(10,20));
        System.out.println(t1.Area_t(10,20));
        System.out.println(s1.Area_s(10));
    }

}
