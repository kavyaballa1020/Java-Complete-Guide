package MultiThreadingDemo;

public class YIeld extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		YIeld t1=new YIeld();
		YIeld t2=new YIeld();
		YIeld t3=new YIeld();
		YIeld t4=new YIeld();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t2.yield();

	}
}
