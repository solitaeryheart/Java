import org.w3c.dom.ls.LSOutput;

public class vehicle {
    vehicle(int a)
    {
        System.out.println("meth 1 vehicle " + a);
    }
    vehicle()
    {
        System.out.println("VEHICLE CLASS OF " );
    }
    public void usesFuel()
    {
        System.out.println("USES FUEL TO WORK");
    }
}
class car extends vehicle{
    car(int a,int b)
    {
        super(a);
        System.out.println("meth 1 car " + b);
    }
    car(int c)
    {
        System.out.println("CLASS OF CAR " + c);
    }


    public void hasWheels()
    {
        System.out.println("HAS WHEELS TO MOVE");
    }

}
class main{
    public static void main(String[] args) {
        car car = new car(1,4);


    }
}
