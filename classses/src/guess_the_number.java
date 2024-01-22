import java.util.Random;
import java.util.Scanner;

class guess_the_number
{
    private int userNo;
    private int compNo;
    private int score = 100;
    private int noOfGuess = 0;

    Scanner sc = new Scanner(System.in);
    public int userInput()
    {
        userNo = sc.nextInt();
        return userNo;
    }
    Random r = new Random();
    public int compInput()
    {
        compNo = r.nextInt(1,101);
        return compNo;
    }
    public boolean isCorrect(int userNo,int compNumber)
    {
        boolean condition = false;
        if(userNo == compNumber)
        {
            System.out.println("YOU HAVE GUESSED THE NUMBER CORRECTLY");
            condition = true;
        } else if (userNo > compNumber)
        {
            System.out.println("THE NUMBER YOU ENTERED IS GREATER THAN THE ACTUAL NUMBER\n\tENTER A DIFFERENT NUMBER");
            condition = false;
            noOfGuess++;
            score --;
        } else if (userNo < compNumber)
        {
            System.out.println("THE NUMBER YOU ENTERED IS LESS THAN THE ACTUAL NUMBER\n\tENTER A DIFFERENT NUMBER");
            condition = false;
            noOfGuess++;
            score --;
        }

        if(condition == true)
        {
            return true;
        }else {
            return false;
        }
    }
    public void setNoOfGuess()
    {
        noOfGuess = 0;
    }

    public int getNoOfGuess()
    {
        return noOfGuess;
    }

    public void setScore() {
         score = 100;
    }

    public int getScore() {
        return score;
    }
}
class MainGamelogic
{
    public static void main(String[] args)
    {
        System.out.println("ENTER ANY NUMBER BETWEEN 1 AND 100");
        guess_the_number gtn = new guess_the_number();
        int computersNo = gtn.compInput();
        for(int i = 0; true; i++)
        {
            int userinput = gtn.userInput();
            boolean isCorrect = gtn.isCorrect(userinput,computersNo);
            if(isCorrect==true)
            {
                System.out.println("YOU GUESSED NUMBER AFTER " + gtn.getNoOfGuess() + " TRIES");
                System.out.println("YOUR SCORE IS " + gtn.getScore());
                break;
            }
        }
    }
}