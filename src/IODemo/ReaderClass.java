package IODemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderClass {

	public static void main(String[] args) throws IOException{
		Reader r=new FileReader("v.txt");
		int data=r.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=r.read();
		}
		
		r.close();
	}

}
