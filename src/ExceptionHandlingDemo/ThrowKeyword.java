package ExceptionHandlingDemo;

public class ThrowKeyword {

	public static void main(String[] args) {
		int age=17;
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}else {
			System.out.println("Person is eligible to vote");
		}
	}
}
