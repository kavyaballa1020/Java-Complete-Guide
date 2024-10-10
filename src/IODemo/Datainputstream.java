package IODemo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Datainputstream {
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream fos=new FileInputStream("a.txt");
		DataInputStream d=new DataInputStream(fos);
		String s=d.readUTF();
		int a=d.readInt();
		System.out.println(a);
		System.out.println(s);
	}
}
