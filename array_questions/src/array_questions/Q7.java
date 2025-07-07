package array_questions;
import java.util.*;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][]arr=new int[3][3];
		System.out.println("Enter 3*3 integer values");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int biggestnumber=arr[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (arr[i][j]>biggestnumber){
					biggestnumber = arr[i][j];
				}
			}
		}
		System.out.println("The biggest number in the array is:" + biggestnumber);
		
		
	}
}
