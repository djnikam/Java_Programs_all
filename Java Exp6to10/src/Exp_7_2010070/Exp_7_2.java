package Exp_7_2010070;

public class Exp_7_2 {

    public static void main(String[] args) {

        String s = null;

        try
        {
            System.out.println(s.length());
        }
        catch(NullPointerException e1)
        {
            System.out.println(e1);
        }

        int[] a = {1,2,3,4};
        try
        {
            System.out.println(a[11]);
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2);
        }

    }
}
