package javafundamentals;
import java.util.*;
public class question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("zero");
		}
		else if(n<0){
			System.out.println("negative");
		}
		else {
			System.out.println("positive");
		}
	
	}

}
