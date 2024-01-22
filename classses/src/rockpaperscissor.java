import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {

    int r;
    int u;
    int compScore;
    int userScore;
    int round;

    public int getCompScore() {
        return compScore;
    }

    public void setCompScore() {
        compScore = 0;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore() {
        userScore = 0;
    }

    public void setRound(int x)
    {
        round = x;
    }
    public int getRound()
    {
        return round;
    }
    Scanner sc = new Scanner(System.in);

    public int userNO()
    {
        u = sc.nextInt();
        return u;
    }
    Random ra = new Random();

    public int randomNO() {
        r = ra.nextInt(1, 4);
        return r;
    }

    public int setGameLogic(int u,int r)
    {
        int whoWon = 0;
        //1=rock
        //2=paper
        //3=scissor
        if (u == 1 && r == 2 || u == 2 && r == 1) {
            if(r == 2 && u == 1)
            {
                System.out.println("COMPUTERS SELECTED PAPER " + r + " YOU SELECTED ROCK " + u );
                System.out.println("COMPUTERS WINS");
                compScore = compScore + 10;
            }
            else if(r == 1 && u == 2){
                System.out.println("COMPUTER SELECTED ROCK " + r + " YOU SELECTED PAPER " + u );
                System.out.println("YOU WIN");
                userScore = userScore + 10;
            }
            whoWon = 2;
            round ++;
        } else if (u == 2 && r == 3 || u == 3 && r ==2) {
            if(r == 3 && u == 2)
        {
            System.out.println("COMPUTERS SELECTED SCISSOR " + r + " YOU SELECTED PAPER " + u );
            System.out.println("COMPUTERS WINS");
            compScore = compScore + 10;
        }
        else if(r == 2 && u == 3){
            System.out.println("COMPUTER SELECTED PAPER " + r + " YOU SELECTED SCISSOR " + u );
            System.out.println("YOU WIN");
            userScore = userScore + 10;
        }
            whoWon = 3;
            round ++;
        } else if (u == 1 && r == 3 || u == 3 && r == 1) {
            if(r == 1 && u == 3)
            {
                System.out.println("COMPUTERS SELECTED ROCK " + r + " YOU SELECTED SCISSOR " + u );
                System.out.println("COMPUTER WINS");
                compScore = compScore + 10;
            }
            else if(r == 3 && u == 1){
                System.out.println("COMPUTERS SELECTED SCISSOR " + r + " YOU SELECTED ROCK " + u );
                System.out.println("YOU WIN");
                userScore = userScore + 10;
            }
            whoWon = 1;
            round ++;
        } else if (u == r) {
           if(r == 1 && u == 1)
           {
               System.out.println("COMPUTERS SELECTED ROCK " + r + " YOU SELECTED ROCK " + u );
               System.out.println("DRAW");
           } else if (r == 2 && u == 2) {
               System.out.println("COMPUTERS SELECTED PAPER " + r + " YOU SELECTED PAPER " + u );
               System.out.println("DRAW");
           } else if (r == 3 && u == 3) {
               System.out.println("COMPUTERS SELECTED SCISSOR " + r + " YOU SELECTED SCISSOR " + u );
               System.out.println("DRAW");
           }
            whoWon = 0;
            round ++;
        }
           if (u > 3) {
                System.out.println("INVALID INPUT\nENTER\n1 FOR ROCK\n2 FOR PAPER\n3 FOR SCISSOR");
           }
        if (u == 0) {
            whoWon = 100;
        }

        return whoWon;

    }

}
class mainGame
{
    public static void main(String[] args)
    {
        System.out.println("ENTER\n1 FOR ROCK\n2 FOR PAPER\n3 FOR SCISSOR\n0 TO END THE GAME");
        rockpaperscissor rps = new rockpaperscissor();
        while(true)
        {
            int compNO = rps.randomNO();
            int userINPUT = rps.userNO();
            rps.setRound(1);
            System.out.println("ROUND " + rps.getRound());
            int condition = rps.setGameLogic(userINPUT,compNO);
            if(condition == 0 || condition == 1 || condition == 2 || condition == 3)
            {
                System.out.println("YOUR SCORE IS " + rps.getUserScore());
               System.out.println("COMPUTERS SCORE IS " + rps.getCompScore());
            } else if (condition == 100) {
                System.out.println("GAME ENDED");
                break;
            }
        }
    }
}