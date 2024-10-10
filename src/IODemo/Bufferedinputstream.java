package IODemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Bufferedinputstream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("K.txt");
		BufferedInputStream bin=new BufferedInputStream(fis);
		
		int i;
		
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
