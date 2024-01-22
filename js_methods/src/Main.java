import java.util.Scanner;

public class Main {


   static int sum(int x, int y)
    {
        int z;
        if(x>y)
        {
             z = x*y;
        }
        else
        {
             z = x*y*2;
        }
        return z;
    }
    public static void main(String[] args){
   {
        System.out.println("ENTER TWO INTEGERS");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sum(a,b);
        System.out.println(c);
    }


}
}