package MultiThreadingDemo;

public class Join extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		Join t1=new Join();
		Join t2=new Join();
		Join t3=new Join();
		Join t4=new Join();
		Join t5=new Join();
		
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
		t2.start();
		
		t4.start();
		t5.start();
	}
}
