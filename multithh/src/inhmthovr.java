
class A{
  public void meth1()
  {
      System.out.println("CLASS A METH 1");
  }
}
class B extends A{
    @Override
    public void meth1()
    {
        System.out.println("CLASS B METH 1");
    }
    public void meth2()
    {
        System.out.println("CLASS A METH 2");
    }
}
public class inhmthovr {
    public static void main(String[] args) {
        B b = new B();
        b.meth1();
        A aa = new A();
        aa.meth1();
    }
}

