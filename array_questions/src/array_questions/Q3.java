package array_questions;
import java.util.*;
public class Q3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Enter the element to search:");
	        int searchElement = sc.nextInt();
	        int index = -1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == searchElement) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}



