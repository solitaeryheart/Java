import java.util.Scanner;
public class Main {

    static void star1(int n) {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                for(int k = 1; k <= j; k++)
                {
                    System.out.print(k +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        star1(5);
    }


}
