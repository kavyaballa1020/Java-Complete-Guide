package IODemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterClass {
	public static void main(String args[]) throws IOException {
		
		Writer w=new FileWriter("v.txt");
		
		w.write("Goal Oriented Person");
		w.close();
	}
}
