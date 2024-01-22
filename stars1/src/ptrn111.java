public class ptrn111
{
    static void ptrn15(int n)
    {
        for(int i = 1; i <=n; i++)
        {
            for(int j = n; j >= i; j--)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void main(String[] args)
    {
        ptrn15(5);
    }
}
