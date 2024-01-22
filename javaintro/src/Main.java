import java.util.Scanner;
public class Main { //class

    public static void main(String[] args) {
//MainCode --> pascal naming convention
//mainCode --> camel case naming convention
//byte --> stores value from -128 to 127
//short --> stores value from -(2^16)/2 to (2^16)/2 -1
//float --> stores value from -(2^32)/2 to (2^32)/2 -1
        System.out.println("ENTER YOUR NAME");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("HEY ");
        System.out.print(name);
        System.out.print("HAVE A GOOD DAY");
    }
}