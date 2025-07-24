package multithreading;
import java.util.*;
public class Q3  implements Runnable {
	@Override
	public void run() {
          for (int i=0;i<=10;i++) {
        	  System.out.println(i);
        	  if(i==5) {
        		  try {
        			  Thread.sleep(5000);
        		  }catch(InterruptedException e) {
        			  System.out.println("exception");
        		  }
        	  }
          }
	}
          public static void main(String[] args) {
        	  Thread t=new Thread(new Q3());
        	  t.start();
          }
}
