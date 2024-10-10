package MultiThreadingDemo;

public class sleep extends Thread{
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				Thread.currentThread().sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
public static void main(String args[]) {
	sleep t1=new sleep();
	sleep t2=new sleep();
	
	
	t1.start();
	t2.start();
}
}
