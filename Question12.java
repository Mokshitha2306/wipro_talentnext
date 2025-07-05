package javafundamentals;
import java.util.*;
public class Question12{

	    public static void main(String[] args) {
	        int number = 1234; 
	        int reversedNumber = 0;

	        while (number != 0) {
	            int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number /= 10;
	        }

	        System.out.println(reversedNumber);
	    }
	}


