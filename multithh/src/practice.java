
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
      //  super22 ss = new super22(5);
      // sub22 sub = new sub22(6);
MyThread t1 = new MyThread();
MyThread2 t2 = new MyThread2();
t1.run();
t2.run();
rThread rt = new rThread();
rt.run();
        Scanner sc = new Scanner(System.in);
        try
        {
            int x = 10;
            int y = sc.nextInt();
            int sum = x / y;
            System.out.println(sum);
        }
        catch(Exception e)
        {
            System.out.println("FAILED TO DIVIDE");
            System.out.println(e);
        }
    }
}
class super22{
    int a;
    super22(int x)
    {
        a = x;
        System.out.println("constructor of superclass " + a);
    }
}
class sub22 extends super22{
    sub22(int y)
    {

        super(y);
        System.out.println("subclass constructor");
    }
}
class MyThread extends Thread{
public void run()
{
    for(int i = 0; i < 10; i++)
    {
        System.out.println("thread is running " + i);
    }
}

}
class MyThread2 extends Thread{
    public void run()
    {
        for(int i = 10; i > 0 ; i --)
        {
            System.out.println("thread 2 is running " + i);
        }
    }

}
class rThread implements Runnable{
    public void run()
    {
        System.out.println("ima thread");
    }

}