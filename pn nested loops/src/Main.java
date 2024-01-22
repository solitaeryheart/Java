import java.security.cert.PolicyNode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENTER 1 TO FIND PRIME NUMBERS TILL N NUMBERS");
        System.out.println("ENTER 2 TO FIND THE FACTORIAL OF AN ENTERED NUMBER");
        System.out.println("ENTER 3 TO FIND FIBONACCI SERIES UPTO GIVEN NUMBER");
        System.out.println("ENTER 4 TO PRINT TABLE OF ENTERED NUMBER");
        System.out.println("ENTER 5 TO CHECK IF ENTERED NUMBER IS A PRIME NUMBER");
        System.out.println("ENTER 6 TO PRINT EVEN NUMBERS BETWEEM ANY ENTERED NUMBERS");
        System.out.println("ENTER 7 TO PRINT SUM OF EVEN NUMBERS BETWEEM ANY ENTERED NUMBERS");
        System.out.println("ENTER 8 TO PRINT SUM OF ODD NUMBERS BETWEEM ANY ENTERED NUMBERS");
        ++

        Scanner sc = new Scanner(System.in);
        int pn = sc.nextInt();

        switch (pn) {
            case 1: //prime_numbers
                System.out.println("ENTER nTH NUMBER TO FIND PRIME NUMBERS BETWEEN THEM");
                int i, j, n, count, total;
                n = sc.nextInt();
                total = 0;
                for (i = 1; i <= n; i++) {
                    count = 0;
                    for (j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        System.out.println(i + " ");
                        total = total + 1;
                    }
                }
                System.out.println("THERE ARE " + total + " PRIME NUMBERS TILL " + n);
                break;

            case 2: //factorial
                System.out.println("ENTER THE NUMBER TO FIND ITS FACTORIAL");
                int k, fact, x;
                fact = 1;
                x = sc.nextInt();
                for (k = 1; k <= x; k++) {
                    fact = fact * k;
                }
                System.out.println(fact);
                break;

            case 3:
                System.out.println("ENTER A NUMBER UPTO WHICH YOU WANT TO FIND THE FIBONACCI SERIES");
                int ii, nn;
                int a = 0;
                int b = 1;
                int c = 0;
                nn = sc.nextInt();
                for (ii = 0; ii <= nn; ii++) {
                    System.out.print(a + " ");
                    c = a + b;
                    a = b;
                    b = c;
                }
                break;

            case 4:
                System.out.println("ENTER NUMBER TO OBTAIN ITS TABLE");
                int w, i1, n1, sum;
                w = sc.nextInt();
                System.out.println("ENTER NUMBER UPTO YOU WANT TO OBTAIN THE TABLE");
                n1 = sc.nextInt();
                for (i1 = 1; i1 <= n1; i1++) {
                    sum = w * i1;
                    System.out.printf("%d x %d = %d\n", w, i1, sum);

                }
                break;

            case 5:
                System.out.println("ENTER A NUMBER");
                int pN, in, npn=0;
                pN = sc.nextInt();
                for (in = 1; in <= pN; in++) {
                    npn = 0;
                    for (int jn = 1; jn <= in; jn++) {
                        if (in % jn == 0) {
                            npn++;
                        }
                    }
                }
                if ( npn == 2) {
                    System.out.println("THIS NUMBER " + pN + " IS A PRIME NUMBER");
                } else {
                    System.out.println("THIS NUMBER " + pN + " IS NOT A PRIME NUMBER");
                }
                break;

            case 6:
                System.out.println("ENTER THE FIRST NUMBER");
                int n11;
                n11 = sc.nextInt();
                System.out.println("ENTER LAST NUMBER");
                int l11;
                l11 = sc.nextInt();
                int eve;
                for(eve = n11; eve<=l11;eve++) {

                    if (eve % 2 == 0) {
                        System.out.println(eve);
                    }
                }
                break;

            case 7:
                System.out.println("ENTER FIRST NUMBER");
                int fn1;
                fn1 = sc.nextInt();
                System.out.println("ENTER LAST NUMBER");
                int ln;
                ln = sc.nextInt();
                System.out.println("THE SUM OF THE EVEN NUMBERS BETWEEN "+ fn1 + " AND " + ln +  " ARE ");
                int sum1 = 0;
                for(int ix = fn1;ix<= ln; ix+=2)
                {
                    if(ix % 2 == 0)
                    {
                        sum1 += ix;
                        System.out.print(ix + ", ");
                    }
                }
                System.out.printf("THE SUM OF THESE NUMBERS IS " + sum1);
                break;

            case 8:
                System.out.println("ENTER FIRST NUMBER");
                int fo;
                fo = sc.nextInt();
                System.out.println("ENTER LAST NUMBER");
                int lo;
                lo = sc.nextInt();
                int sumOdd = 0;
                System.out.println("THE NUMBERS BETWEEN "+ fo + " AND " + lo +  " ARE ");
                for(int inx = fo;inx<=lo;inx++)
                {
                    if(inx % 2 !=0)
                    {
                        sumOdd += inx;
                        System.out.print(inx + ", ");
                    }
                }System.out.printf("THE SUM OF THESE NUMBERS IS " + sumOdd);
                break;

            case 9:
                System.out.println("ENTER A DECIMAL NUMBER ");
                int decimal = sc.nextInt();
                String binary = "";
                for(int bi = decimal; bi>0; bi = bi/ 2)
                {
                    int bit = bi%2;
                    binary = bit + binary;
                }
                System.out.printf("THE BINARY REPRESENTATAION OF THE DECIMAL NUMBER %d IS ", decimal);
                System.out.println(binary);
                break;





        }
    }
}