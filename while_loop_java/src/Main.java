import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int i =1;
        int sum =0;
        int n = sc.nextInt();
        while(i<=n)
        {
             sum =sum+i;
            i++;
            System.out.println(i);
        }
        System.out.println(sum);
    }*/
        /*    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int fact = 1;
        while (i<=n)
        {
            fact = fact *i;
            i++;
            System.out.print(i + " * ");
            if(i>n)
                break;
        }
        System.out.print(" = "+fact);

    }*/
        /*   int num, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = input.nextInt();

        while (num > 0) {
            fact *= num;
            num--;
        }

        System.out.println("Factorial = " + fact);



    int i = 1;
    int fact = 1;
        System.out.print("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i<=n)
        {
            fact = fact * i;

            i++;

        }
        System.out.println("the factorial of "+n + " is "+fact);*/
        /*  System.out.print("enter a number : ");
Scanner sc = new Scanner(System.in);
int j = sc.nextInt();
     int i=1,count=0;
     while (i<=j)
     {
         count = 0;
         int n = 1;
         while (n<=i)
         {
             if(i%n==0)
                 count++;
             n++;
         }
         if(count == 2)
         {
             System.out.println(i+" is a prime number");
         }

         i++;
     }

*/
        /*    int i=1;
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(i<=n)
        {
            if(n%i==0)
            {
                count++;
            }

            i++;
        }
        if(count==2)
        {
            System.out.println(n+ " is a prime number");

        }else if(count>2 || count < 2)
        {
            System.out.println(n+ " is not a prime number");
        }*/


        Scanner sc = new Scanner(System.in);
        int b,num;
        System.out.print("enter a number : ");
       Random r = new Random();
       num = r.nextInt(1,101);

        while (true)
        {
            int c = sc.nextInt();
            if(num==c)
            {
                System.out.println("right guess");
                break;
            }
            if(c>num)
            {
                System.out.println("entered number is higher than guessed number, try again ");
                
            }
            if(c<num)
            {
                System.out.println("entered num is lower than guessed number, try again ");

            }


        }
     } //  public static void  ends
} // public class ends

