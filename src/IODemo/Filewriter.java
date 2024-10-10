package IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String args[]) throws IOException {
		
		FileWriter f=new FileWriter("y.txt");
		f.write("i am a full stack developer");
		f.close();
	}
}
