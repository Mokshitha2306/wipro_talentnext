package oops_questions;
import java.util.*;
public class Q1 {
	public class Calculator {
	    public static int powerInt(int base, int exponent) {
	        int result = 1;
	        for (int i = 0; i < exponent; i++) {
	            result *= base;
	        }
	        return result;
	    }
	    public static double powerDouble(double base, int exponent) {
	        double result = 1;
	        for (int i = 0; i < exponent; i++) {
	            result *= base;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer base: ");
	        int intBase = scanner.nextInt();
	        System.out.print("Enter an integer exponent: ");
	        int intExponent = scanner.nextInt();
	        int intResult = powerInt(intBase, intExponent);
	        System.out.println(intBase + "^" + intExponent + " = " + intResult);
	        System.out.print("\nEnter a decimal base: ");
	        double doubleBase = scanner.nextDouble();

	        System.out.print("Enter an integer exponent: ");
	        int doubleExponent = scanner.nextInt();

	        double doubleResult = powerDouble(doubleBase, doubleExponent);
	        System.out.println(doubleBase + "^" + doubleExponent + " = " + doubleResult);

	        scanner.close();
	    }
	}


}
