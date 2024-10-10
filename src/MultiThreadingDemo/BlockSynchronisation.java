package MultiThreadingDemo;

class PrintTable1{
	void table(int n) {
		synchronized(this)
		{
			for(int i=1;i<=10;i++) {
				System.out.println(n+" X "+i+" = "+n*i);
			}
		}
	}
}
class threads1 extends Thread{
	PrintTable1 t1;
	threads1(PrintTable1 t1){
		this.t1=t1;
	}
	public void run() {
		t1.table(4);
	}
	
}
class threads2 extends Thread{
	PrintTable1 t2;
	threads2(PrintTable1 t2){
		this.t2=t2;
	}
	public void run() {
		t2.table(8);
	}
}
public class BlockSynchronisation {
	public static void main(String[] args) {
		PrintTable1 t=new PrintTable1();
		threads1 t1=new threads1(t);
		threads2 t2=new threads2(t);
		t1.start();
		t2.start();
	}

}
