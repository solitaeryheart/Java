public class PrimeNumbers {
    public static void main(String[] args) {

  int start = 2;
   int end = 100;
  System.out.println("Prime numbers between " + start + " and " + end + " are:");

 for (int i = start; i <= end; i++)

 {
   int factors = 0;

  for (int j = 2; j <= i / 2; j++) 

{
  if (i % j == 0) {
    factors++;
                }
            }

            if (factors == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
