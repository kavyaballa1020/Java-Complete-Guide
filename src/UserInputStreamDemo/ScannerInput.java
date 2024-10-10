package UserInputStreamDemo;
import java.util.*;
public class ScannerInput {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=obj.nextInt();
		System.out.println("Enter your name");
		String b=obj.next();
		System.out.println("Name : "+b);
		System.out.println("Age : "+a);
		
	}

}
