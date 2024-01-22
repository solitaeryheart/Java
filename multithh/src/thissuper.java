public class thissuper {
    public static void main(String[] args) {
      //  super1 ss = new super1(1);

        sub1 sss = new sub1(5);
        System.out.println(sss.getA());
       // System.out.println(sss.getB());

    }
}
class super1{
    int a;
    super1(int x)
    {
        a = x;
    }
    public int getA()
    {
        return a;
    }
}
class sub1 extends super1{
    int b;
    sub1(int y)
    {
        super(y);
        System.out.println("im a child class constructor");
    }

    public int getB()
    {
        return b;
    }
}