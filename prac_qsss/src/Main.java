import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        float eng = sc.nextFloat();
        float math = sc.nextFloat();
        float science = sc.nextFloat();
        float perc = (eng + science + math)/300f*100f;
        if(perc >= 40 && eng > 33 && science > 33 && math > 33){
            System.out.println("passed");
        }
        else
        {
            System.out.println("sorry failed");
        }
        System.out.println("enter your yearly income");
        float inc = sc.nextFloat();
        float inc1 = (5f/100f)*inc;
        float inc2 = (20f/100f)*inc;
        float inc3 = (30f/100f)*inc;
        if(inc<250000)
        {
            System.out.println("you are not eligible for paying tax");
        }
        if(inc>=250000 && inc <=500000)
        {
            System.out.println("your payable tax is 5% which is "+inc1);
        }
        if(inc>=500000 && inc <= 1000000)
        {
            System.out.println("your payable tax is 10% which is "+inc2);
        }
        if(inc3>1000000)
        {
            System.out.println("your payable tax is 30% which is "+inc3);
        }*/
       /* int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
         System.out.println("enter a website");
        String ss = sc.next();
        if(ss.endsWith(".org"))
        {
            System.out.println("this website is an organisation website");
        }
        if(ss.endsWith(".in"))
        {
            System.out.println("this website is an indian website");
        }
        if(ss.endsWith(".com"))
        {
            System.out.println("this website is a commercial" +
                    " website");
        }
        int leapyear = sc.nextInt();
        if(((leapyear % 4 == 0)&& (leapyear%100!=0)) || (leapyear %400==0))
        {
            System.out.println(leapyear+" is a leap year");
        }else {
            System.out.println(leapyear+ " is not a leap year");
        }
    }
}