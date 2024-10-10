package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Outputstreamwriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("c.txt");
		OutputStreamWriter out=new OutputStreamWriter(fos);
		out.write("Be independent");
		out.close();
	}

}
