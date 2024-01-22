public class mthd_ovrlod {
    static void eat()
    {
        System.out.println("im eating carrots");
    }
    static void eat(int a)
    {
        System.out.println("im eating " +a+ " carrots");
    }
    static void eat(String a )
    {
        System.out.println("im eating " +  a +" carrots");
    }
public static void main(String [] args)
{
    eat();
    eat(5);
    eat("two");
}
}