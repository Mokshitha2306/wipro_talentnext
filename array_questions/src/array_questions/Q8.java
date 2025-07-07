package array_questions;
import java.util.*;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  nummber of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter" + "values");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		if(n<2) {
			System.out.println("Array contain 2 numbers");
			return;
		}
		Arrays.sort(arr);

        System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two numbers: " + arr[n - 1] + ", " + arr[n - 2]);
    }	
	}


