package javafundamentals;

public class question1 {
	
	    public static void main(String[] args) {
	        if (args.length != 2) {
	            System.out.println("provide two arguments");
	            return;
	        }

	        System.out.println(args[0] + " Technologies " + args[1]);
	    }
	}
