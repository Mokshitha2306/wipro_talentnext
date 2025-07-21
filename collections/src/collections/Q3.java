package collections;
import java.util.*;
public class Q3 {

	public class ListColl_Q3 {
	public static void printAll(ArrayList<String> s) {
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
		public static void main(String[] args) {
	      ArrayList<String> n=new ArrayList<>();
	      n.add("Mokshi");
	      n.add("Manju");
	      n.add("Tharun");
	      n.add("Vaish");
	      n.add("Teju");
	      printAll(n);
	      
	  	}
	}
}
