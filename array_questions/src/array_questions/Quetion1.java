package array_questions;

import java.util.Scanner;

public class Quetion1 {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the length of array");
	    	int n=sc.nextInt();
	    	int arr[]=new int[n];
	    	System.out.println("Enter the values");
	    	for(int i=0;i<n;i++) {
	    		arr[i]=sc.nextInt();
	    	}
	    	int sum=arr[0];
	    	for(int i=0;i<n;i++) {
	    		sum+=arr[i];
	    	}
	    	int avg=sum/n;
	    	System.out.println("sum:" + sum);
	    	System.out.println("Average" + avg);
	    	
	    }
	    }
	        


