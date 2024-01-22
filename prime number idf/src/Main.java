public class Main {

        public static void main(String[] args) {

            System.out.println("Prime numbers between 2 and 100 are: ");

            for (int i = 2; i <= 100; i++) {
                int factors = 0;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        factors++;
                    }
                }

                if (factors == 0) {
                    System.out.print(i + "\n");
                }
            }
        }
    }
