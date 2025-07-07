package javafundamentals;
import java.util.*;
public class Question11 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int sum = 0;

	        while (number != 0) {
	            int lastDigit = number % 10;
	            sum += lastDigit;
	            number /= 10;
	        }

	        System.out.println("Sum of digits: " + sum);
	        sc.close();
	        
	    }
	}


