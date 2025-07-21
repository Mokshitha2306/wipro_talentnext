package collections;
import java.util.*;
public class Q6 {
	public class ListColl_Q6 {

		public static void main(String[] args) {
	     Vector<Integer> vec=new Vector<>();
	     vec.add(10);
	     vec.add(20);
	     vec.add(30);
	     System.out.println(vec);
	     vec.addFirst(40);
	     System.out.println(vec);
	     vec.addLast(50);
	     System.out.println(vec);
	     vec.remove(Integer.valueOf(10));
	     System.out.println(vec);
		}

	}

}
