package MultiThreadingDemo;
//The Thread priorities will be from 1 to 10; The by default value of the thread will be 5;

public class Priority extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
public static void main(String args[]) {
	Priority t1=new Priority();
	Priority t2=new Priority();
	Priority t3=new Priority();
	Priority t4=new Priority();


	t1.setPriority(MIN_PRIORITY);
	t2.setPriority(MAX_PRIORITY);
	t3.setPriority(NORM_PRIORITY);
	t4.setPriority(3);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
