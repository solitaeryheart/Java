public class pq {
/*  static void star1(int n)
  {
      for(int i = 1; i <= n  ; i++)
      {

          for(int j = 1; j <= i; j++)
          {
              System.out.print("* ");
          }
          System.out.println();
      }
      for(int i = 1; i <= n; i++)
      {
          for(int j = n; j >= i; j--)
          {
              System.out.print("* ");
          }
          System.out.println();
      }
  }*/

 /*   static int sumN(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        else{
            return  n + sumN(n-1);
        }
    }*/
    static int fibo(int n)
    {
        if(n==1 || n==2)
        {
            return n-1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
  public static void main(String[] args)
  {

      int r = fibo(7);
      System.out.println(r);
  }
}
