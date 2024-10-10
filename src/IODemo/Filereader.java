package IODemo;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException {
		FileReader r=new FileReader("y.txt");
		int data=r.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=r.read();
		}
		r.close();
	}

}
