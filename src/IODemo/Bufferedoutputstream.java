package IODemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedoutputstream {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("K.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fos);
		
		String s="I am an independent person";
		
		byte b[]=s.getBytes();
		bout.write(b);
		
		bout.close();
		fos.close();
	}
}
