package multithreading;

public class Q1 {
		  public static void main(String[] args) {
			  Runnable task=() ->{
				  System.out.println("Thread is running "+ Thread.currentThread().getName());
				  
			  };
			  Thread t1=new Thread(task);
			  t1.setName("Scooby");
			  
			  Thread t2= new Thread(task);
			  t2.setName("Shaggy");
			  
			  t1.start();
			  t2.start();
		  }
		}


