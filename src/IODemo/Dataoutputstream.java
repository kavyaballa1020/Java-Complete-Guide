package IODemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dataoutputstream {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos=new FileOutputStream("a.txt");
		DataOutputStream d=new DataOutputStream(fos);
		d.writeUTF("Live for yourself");
		d.writeInt(19);
		d.writeDouble(2.5);
		System.out.println("Success");
		d.close();
	}
}
