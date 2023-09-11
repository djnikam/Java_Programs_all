// Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

class Studenta
{
    String name;
        Studenta()
        {
           name = "Unknown";
        }
        Studenta(String nm)
        {
            name =nm;

        }
        void Display()
        {
            System.out.println(name);
        }

}
public class Constroverload_5
{
    public static void main(String[] args) {
        Studenta a1 = new Studenta();
        Studenta a2 = new Studenta("Dhanraj");
        a1.Display();
        a2.Display();
    }
}

