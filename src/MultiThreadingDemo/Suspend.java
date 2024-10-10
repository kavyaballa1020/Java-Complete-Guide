package MultiThreadingDemo;

public class Suspend extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
//				Thread.currentThread().sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String args[]) {
		Suspend t1=new Suspend();
		Suspend t2=new Suspend();
		Suspend t3=new Suspend();

		t1.start();
		t2.start();
		t3.start();
		t2.suspend();
		t2.resume();
	}

}
