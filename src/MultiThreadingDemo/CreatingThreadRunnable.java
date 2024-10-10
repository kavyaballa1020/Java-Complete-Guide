package MultiThreadingDemo;

public class CreatingThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is created by implementing Runnable Interface");
	}
	public static void main(String args[]) {
		CreatingThreadRunnable t=new CreatingThreadRunnable();
		Thread obj=new Thread(t);
		obj.start();
	}

}
