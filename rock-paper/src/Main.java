import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nu;
        Random r = new Random();
        nu = r.nextInt(1,4);
        System.out.println("ENTER \n1 FOR ROCK\n2 FOR PAPER\n3 FOR SCISSOR");
        // 1 = rock 2 = paper 3 = scissor
        int a = sc.nextInt();
        System.out.println("YOU DRAWED "+a+" AND THE COMPUTER DRAWED " + nu);
        if(a == 1 &&  nu == 2 || a == 2 && nu == 1)
        {
            if(a>nu)
            {
                System.out.println("YOU WON");
            }
            else
            {
                System.out.println("COMPUTER WON");
            }
        }
        if(a == nu)
        {
            System.out.println("DRAW");
        }
        if(a == 2 && nu == 3 || a == 3 && nu == 2)
        {
            if(a>nu)
            {
                System.out.println("YOU WON");
            }
            else
            {
                System.out.println("COMPUTER WON");
            }
        }
        if(a == 1 && nu == 3 || a == 3 && nu == 1)
        {
            if(a < nu)
            {
                System.out.println("YOU WON");
            }
            else
            {
                System.out.println("COMPUTER WON");
            }
        }
    }












}








