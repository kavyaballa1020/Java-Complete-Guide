package UserInputStreamDemo;
import java.io.*;
public class BufferedReaderInput {
	public static void main(String args[]) throws IOException {
		//Buffered reader reads the text very faster. where scanner reads the different types of data faster.Inputstream reader reads the single character at a time.buffered reader comnines those
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age");
		int a=Integer.parseInt(obj.readLine());
		System.out.println("Enter your name");
		String b=obj.readLine();
		System.out.println("Name : "+b);
		System.out.println("Age : "+a);
	}
}
