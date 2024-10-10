package IODemo;
import java.io.*;
//file inputstream is used to read the single character.
public class Fileinputstream {
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream fis=new FileInputStream("Kavya.txt");
		
		int i;
		
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		fis.close();
	}
}
