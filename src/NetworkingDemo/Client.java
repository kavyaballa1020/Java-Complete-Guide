package NetworkingDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket sc=new Socket("localhost",3000);
		
		PrintWriter out=new PrintWriter(sc.getOutputStream(),true);
		out.println("Hello");
		
		BufferedReader in=new BufferedReader(new InputStreamReader(sc.getInputStream()));
		String obj=in.readLine();
		System.out.println(obj);
		
		out.close();
		sc.close();

	}

}
