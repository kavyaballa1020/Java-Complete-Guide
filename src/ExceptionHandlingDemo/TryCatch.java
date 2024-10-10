package ExceptionHandlingDemo;

public class TryCatch {
	public static void main(String args[]) {
		int a=10;
		try{
			int[] z= {1,2,3};
			int c=a/0;
			System.out.println(z[8]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally Block Always Executes");
		}
	}
}
