package p1;
interface A{
    void meth1();
    void meth2();
}
public class MyClass implements A
{
    public void meth1()
    {
        System.out.println("IN METHOD 1");
    }
    public void meth2()
    {
        System.out.println("IN METHOD 2");
    }
}
