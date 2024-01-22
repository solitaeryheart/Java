import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Thread t2 = new Thread(() -> {
            while (true) {
                synchronized (rand) {
                    try {
                        rand.wait();
                        int num = rand.nextInt(100);
                        System.out.println("Square of " + num + " is " + (num * num));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t3 = new Thread(() -> {
            while (true) {
                synchronized (rand) {
                    try {
                        rand.wait();
                        int num = rand.nextInt(100);
                        System.out.println("Cube of " + num + " is " + (num * num * num));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t1 = new Thread(() -> {
            while (true) {
                int num = rand.nextInt(100);
                System.out.println("Generated Number: " + num);

                if (num % 2 == 0) {
                    synchronized (rand) {
                        rand.notifyAll();
                    }
                } else {
                    synchronized (rand) {
                        rand.notifyAll();
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
