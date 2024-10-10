package IODemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter f=new FileWriter("b.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("i want to be successful");
		b.close();
	}

}
