public class ptrn_star2
{
    static void ptrn2(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void ptrn22(int n)
    {
        for(int i = n-1; i>=1;i--)
        {
            for(int j = i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args)
    {
        ptrn2(5);
        ptrn22(5);
    }
}
