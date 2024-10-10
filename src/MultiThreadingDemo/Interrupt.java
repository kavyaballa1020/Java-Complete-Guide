package MultiThreadingDemo;

class interruptExample extends Thread{
	public void run() {
		try {
			for(int i=1;i<6;i++) {
				System.out.println(getName());
				Thread.sleep(1000);
			}	
		}catch(Exception i) {
			System.out.println(i);
		}
	}
}
public class Interrupt {

	public static void main(String[] args) {
		interruptExample t1=new interruptExample();
		interruptExample t2=new interruptExample();

		t1.start();
		t1.interrupt();
		t2.start();
	}
}
