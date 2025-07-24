package multithreading;

import java.util.Random;

public class Q2 {

    static class Question2 implements Runnable {
        String[] colours = {"red", "orange", "black", "blue", "green", "pink"};

        @Override
        public void run() {
            Random rand = new Random();
            while (true) {
                int ind = rand.nextInt(colours.length);
                String str = colours[ind];
                System.out.println("Colour: " + str);
                if ("red".equalsIgnoreCase(str)) {
                    System.out.println("Red colour found!");
                    break;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Question2());
        t1.start();
    }
}
