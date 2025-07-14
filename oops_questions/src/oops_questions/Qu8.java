package oops_questions;
import java.util.*;
public abstract class Qu8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()%2==0){
			int left=0,right=str.length()-1;
			int mid=left+(right-left)/2;
			for(int i=0;i<=mid;i++) {
				System.out.print(str.charAt(i));
			}
		}
		else {
			System.out.println(-1);
		}
	}
}
