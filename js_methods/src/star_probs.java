import java.util.Scanner;

public class star_probs
{

    public class pq
    {
        static void star1(int n)
        {
            for (int i = 1; i <= n; i++)
            {

                for (int j = 1; j <= i; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            star1(s);
        }


    }
}
