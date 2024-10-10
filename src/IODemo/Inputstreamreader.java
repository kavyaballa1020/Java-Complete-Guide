package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputstreamreader {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("c.txt");
		InputStreamReader r=new InputStreamReader(fis);
		int data;
		while((data=r.read())!=-1) {
			System.out.print((char)data);
		}
	}

}
