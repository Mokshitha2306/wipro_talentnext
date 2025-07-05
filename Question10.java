package javafundamentals;
import java.util.*;
public class Question10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        boolean isPrime = true;

	        // Prime numbers are greater than 1
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            // Check for factors
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Output the result
	        if (isPrime)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
	}


