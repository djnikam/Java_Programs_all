		class Grandfather
        {	
		       void show()
	    {
    	        System.out.println("Grandfather");
	    }
		}
	
    	class Father extends Grandfather
    	{
    	    void showdata()
	    {
    	        System.out.println("Father");
        }
	    }
    	
		class Son extends Father
    	{
    	    void Show()
    	    {
    	        System.out.println("Son");
    	    }
    	}
    	
    	class Daughter extends Father
    	{
    	    void Display()
    	    {
    	        System.out.println("Daughter");
    	    }
    	}
    	
    	public class Expt_4_4
    	{
    	    public static void main(String[] args)
    	    {
                Son S1 = new Son();
    	        Daughter D1= new Daughter();
    	        Father F1 = new Father();
    	        S1.Show();
    	        S1.showdata();
    	        S1.show();
    	        D1.Display();
    	        D1.showdata();
    	        D1.show();
    	    }
    	}
    