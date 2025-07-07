package array_questions;
import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("After removing duplicates");
		for(int i=0;i<n;i++) {
			boolean isDupicate=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDupicate=true;
					break;
				}
			}
			if(!isDupicate) {
				System.out.println(arr[i] + " ");
			}
		}
		
	}

}
