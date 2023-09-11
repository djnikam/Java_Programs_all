
interface camera
{
    void click();
    void record();
}

interface player
{
    void play();
    void pause();
    void stop();
}

class Smartphone implements camera,player
{
    public void click()
    {
        System.out.println("Click");
    }
    public void record()
    {
        System.out.println("Record");
    }
    public void play()
    {
        System.out.println("Play");
    }

    public void pause()
    {
        System.out.println("Pause");
    }

    public void stop()
    {
        System.out.println("Stop");
    }   
}

public class Multipleinh {

    public static void main(String[] args) {
        
        Smartphone s1 = new Smartphone();
        s1.click();
        s1.record();
        s1.play();
        s1.pause();
        s1.stop();
    }   
}
