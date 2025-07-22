package ios_stream;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter the letter: ");
        char d = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == d) {
                count++;
            }
        }

        System.out.println("The letter '" + d + "' appears " + count + " times.");
    }
}
