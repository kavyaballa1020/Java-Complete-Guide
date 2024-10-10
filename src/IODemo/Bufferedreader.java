package IODemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader {

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("b.txt");
		BufferedReader b=new BufferedReader(f);
		int data;
		while((data=b.read())!=-1) {
			System.out.print((char)data);
		}

	}

}
