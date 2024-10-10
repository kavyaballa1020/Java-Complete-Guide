package MultiThreadingDemo;

public class CreatingThreadExtending extends Thread{
	public void run() {
		System.out.println("Thread is created by Extending the Thread Class");
	}
	public static void main(String args[]) {
		CreatingThreadExtending t1=new CreatingThreadExtending();
		t1.start();
		
//		t1.start();  //it throws exception because the first t1.start method completed the task present in run method, so there is no need of another thread .
//		t1.run();   //we are calling the run method The thread wont be created here.
	}
}
