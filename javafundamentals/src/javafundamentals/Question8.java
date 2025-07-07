package javafundamentals;
import java.util.*;
public class Question8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a color code: ");
	        String colorCode = sc.next().toUpperCase();

	        String colorName;

	        switch (colorCode) {
	            case "R":
	                colorName = "Red";
	                break;
	            case "B":
	                colorName = "Blue";
	                break;
	            case "G":
	                colorName = "Green";
	                break;
	            case "O":
	                colorName = "Orange";
	                break;
	            case "Y":
	                colorName = "Yellow";
	                break;
	            case "W":
	                colorName = "White";
	                break;
	            default:
	                colorName = "Invalid Code";
	                break;
	        }

	        System.out.println(colorName);
	    }
	}


