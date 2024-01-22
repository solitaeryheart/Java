class shape
{
    void rectangle()
    {
        System.out.println("THIS IS A RECTANGLE");
    }
    void square()
    {
        System.out.println("THIS IS A SQUARE");
    }
    void circle()
    {
        System.out.println("THIS IS A CIRCLE");
    }
}

class areas extends shape
{
    void rectAREA()
    {
        int a = 41;
        int b = 44;
        int area = a*b;
        System.out.println("THE AREA OF RECTANGLE IS "+area);
    }
    void sqAREA()
    {
        int a = 77;
        int area = a*a;
        System.out.println("THE AREA OF SQUARE IS "+area);
    }
    void crAREA()
    {
        float r = 40;
        float area = 3.14f*r*r;
        System.out.println("THE AREA OF CIRCLE IS "+area);
    }
}

public class Main {
    public static void main(String[] args)
    {
        areas obj = new areas();
        obj.rectAREA();
        obj.sqAREA();
        obj.crAREA();
        shape obj1 = new shape();
        obj.circle();

    }
}