package NetworkingDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args[]) throws IOException {
		
		ServerSocket sc=new ServerSocket(3000);
		Socket sc2=	sc.accept();

		PrintWriter out=new PrintWriter(sc2.getOutputStream(),true);
		out.println("Server says Hi");
		
		BufferedReader in=new BufferedReader(new InputStreamReader(sc2.getInputStream()));
		String obj=in.readLine();
		System.out.println(obj);
		
		in.close();
		out.close();
	}

}
