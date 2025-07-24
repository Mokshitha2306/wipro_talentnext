package multithreading;

public class Q4 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Exception in t1");
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Exception in t2");
                    }
                }
            }
        });

        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Exception during join");
        }

        t2.start(); 
    }
}
