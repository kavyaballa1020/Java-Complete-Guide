package MultiThreadingDemo;

public class MethodSynchronization extends Thread{
	
	public synchronized void run() {
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
}
public static void main(String args[]) {
	
	MethodSynchronization t1=new MethodSynchronization();
	MethodSynchronization t2=new MethodSynchronization();
	MethodSynchronization t3=new MethodSynchronization();
	MethodSynchronization t4=new MethodSynchronization();
	
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();

}
}
