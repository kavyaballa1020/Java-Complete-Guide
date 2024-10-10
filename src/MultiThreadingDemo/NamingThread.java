//if we do not set the name of the thread then by default the namings of the thread will be thread-0, thread-1 etc.

package MultiThreadingDemo;

public class NamingThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		NamingThread obj=new NamingThread();
		NamingThread obj1=new NamingThread();
		NamingThread obj2=new NamingThread(	);


		obj1.setName("First Thread........");
		obj2.setName("Second Thread.......");
		
		obj.start();
		obj1.start();
		obj2.start();
		
		System.out.println(Thread.currentThread().getName());  // returns the main thread name and we can also change the main thread name by setname property.
	}

}
