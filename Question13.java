package javafundamentals;

public class Question13 {
	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Please provide a number as a command line argument.");
	            return;
	        }

	        String numStr = args[0];
	        try {
	            int num = Integer.parseInt(numStr);
	            if (isPalindrome(num)) {
	                System.out.println(num + " is a palindrome");
	            } else {
	                System.out.println(num + " is not a palindrome");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input: Please provide a valid integer.");
	        }
	    }

	    public static boolean isPalindrome(int num) {
	        String numStr = String.valueOf(num);
	        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
	        return numStr.equals(reversedNumStr);
	    }
	}


