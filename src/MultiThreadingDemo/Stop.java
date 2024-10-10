package MultiThreadingDemo;

public class Stop extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Stop t1=new Stop();
		Stop t2=new Stop();
		Stop t3=new Stop();
		
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");

		t1.start();
		t2.start();
		t2.stop();
		t3.start();

	}

}
