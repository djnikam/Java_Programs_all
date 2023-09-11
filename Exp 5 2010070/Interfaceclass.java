// Problem Statements2: Interface : Implement java program for following
 
// Class JavaPgm and Class CPgm implements the above interface. In main class create the objects of JavaPgm and CPgm classes to see the implementation of getType() and getVersion() method

interface Language
{
    public void getType();
    public void getVersion();
}

class JavaPgm implements Language
{
    public void getType()
    {
     System.out.println("Gettype in Javapgm. ");
    }

    public void getVersion()
    {
     System.out.println("Version in javapgm. ");
    }
}

class CPgm implements Language
{
    public void getType()
    {
        System.out.println("Gettype in cpgm. ");
    }

    public void getVersion()
    {
        System.out.println("Version in cpgm. ");
    }
}

public class Interfaceclass {
    public static void main(String[] args)
    {
        CPgm c1 = new CPgm();
        JavaPgm j1 = new JavaPgm();
        j1.getType();
        j1.getVersion();
        c1.getType();
        c1.getVersion();
    }
}

