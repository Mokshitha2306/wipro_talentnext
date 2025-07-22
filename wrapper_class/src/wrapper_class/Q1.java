package wrapper_class;

public class Q1 {

	public class Question1 {

		    public static void main(String[] args) {
		        if (args.length == 0) {
		            System.out.println("Please enter a number as command line argument.");
		            return;
		        }

		        int number = Integer.parseInt(args[0]);

		        System.out.println("Given Number :" + number);
		        System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
		        System.out.println("Octal equivalent :" + Integer.toOctalString(number));
		        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number));
		    }
		}

}
