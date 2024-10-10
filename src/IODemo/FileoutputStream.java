package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos=new FileOutputStream("Kavya.txt");
		
		String s="Hello i am Kavya and i am full stack Developer";
		byte b[]=s.getBytes();
		
		fos.write(b); // it only takes bytes so we convert the string to bytes.
		
		
		System.out.println("Success");
		fos.close();
	}

}
