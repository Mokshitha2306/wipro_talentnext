package array_questions;
import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of elements:");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter the array values:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        System.out.println("Corresponding ASCII characters:");
		        for (int a:arr) {
		        	if(a>=0&&a<127) {
		            System.out.println((char) a);
		        	}else {
		        		System.out.println("Invalid");
		        	}
		        }
		       
		    }
		}


