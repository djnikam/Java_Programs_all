class Car
{
    void VehicleType()
    {
        System.out.println("Four Wheeler");
    }
}

class Maruti extends Car
{
    void Brand()
    {
        System.out.println("Maruti Suzuzuki");
    }
}

class Maruti_800 extends  Maruti
{
    void Speed()
    {
        System.out.println("150 km/hr");
    }

}

public class Expt_4_2 {
    public static void main(String[] args) {
        Maruti_800 M1 = new Maruti_800();
        Maruti M2 = new Maruti();
        M1.Brand();
        M1.Speed();
        M2.Brand();
        M2.VehicleType();
    }
}

