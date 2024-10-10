package MultiThreadingDemo;

public class isAlive extends Thread{
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String args[]) {
		isAlive t1=new isAlive();
		System.out.println("Before starting the thread : "+t1.isAlive());
		t1.start();
		System.out.println("After Starting the thread : "+t1.isAlive());
	}

}
