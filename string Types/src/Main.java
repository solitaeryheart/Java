import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("Enter a positive integer n: ");
            int n = in.nextInt();
            int sum = 0;
            int i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("The sum of the first " + n + " positive integers is " + sum + ".");
        }
    }
}
