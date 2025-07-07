package array_questions;
import java.util.*;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the elements");
				int n=sc.nextInt();
				int[] arr=new int[n];
				System.out.println("enter the size of arr");
				for(int i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				rearrangeEvenOdd(arr);
				System.out.println("rearranged array");
				for(int num: arr) {
					System.out.println(num+" ");
				}
	}
	
	public static void rearrangeEvenOdd(int[]arr) {
	int nextEven = 0;
    int nextOdd = arr.length - 1;

    while (nextEven < nextOdd) {
        if (arr[nextEven] % 2 == 0) {
            nextEven++;
        } else {
            if (arr[nextOdd] % 2 != 0) {
                nextOdd--;
            } else {
                int temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd] = temp;
                nextEven++;
                nextOdd--;
            }
        }
    }
}
	

}
