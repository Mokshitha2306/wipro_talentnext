package javafundamentals;
import java.util.*;
public class Question14 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter month number (1-12): ");
	        int month = sc.nextInt();

	        String monthName = "";

	        switch (month) {
	            case 1:
	                monthName = "January";
	                break;
	            case 2:
	                monthName = "February";
	                break;
	            case 3:
	                monthName = "March";
	                break;
	            case 4:
	                monthName = "April";
	                break;
	            case 5:
	                monthName = "May";
	                break;
	            case 6:
	                monthName = "June";
	                break;
	            case 7:
	                monthName = "July";
	                break;
	            case 8:
	                monthName = "August";
	                break;
	            case 9:
	                monthName = "September";
	                break;
	            case 10:
	                monthName = "October";
	                break;
	            case 11:
	                monthName = "November";
	                break;
	            case 12:
	                monthName = "December";
	                break;
	            default:
	                monthName = "Invalid month number. Please enter a number between 1 and 12.";
	        }

	        System.out.println(monthName);
	      
	    }
	}


