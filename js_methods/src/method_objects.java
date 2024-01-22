import java.util.Scanner;

public class method_objects {
  public int avg(int x, int y, int v, int u, int t) {
        int z = (x + y + v + u + t) / 5;
        return z;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS OF STUDENT IN ENGLISH : ");
        System.out.println("ENTER MARKS OF STUDENT IN SCIENCE : ");
        System.out.println("ENTER MARKS OF STUDENT IN MATHS : ");
        System.out.println("ENTER MARKS OF STUDENT IN SSC : ");
        System.out.println("ENTER MARKS OF STUDENT IN URDU : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f;
        method_objects obj = new method_objects();
        f= obj.avg(a,b,c,d,e);
        System.out.println(f);


    }

}