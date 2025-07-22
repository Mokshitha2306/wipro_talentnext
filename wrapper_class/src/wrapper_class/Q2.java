package wrapper_class;
import java.util.*;
public class Q2 {
		   public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter an integer (1 to 255): ");
		        int num = sc.nextInt();

		        if (num < 1 || num > 255) {
		            System.out.println("Number must be between 1 and 255.");
		            return;
		        }

		        String b= Integer.toBinaryString(num);
		        String formattedBinary = String.format("%8s", b).replace(' ', '0');

		        System.out.println("Binary : " + formattedBinary);
		    }
		}

