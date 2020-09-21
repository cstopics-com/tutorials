package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {
	public static void main(String[ ] args) {
		
		try {
			// Open a socket to the server.
			Socket sock = new Socket("127.0.0.1", port);
			// Print and send the request string.
			String req = "This is the way the world ends";
			System.out.println("Sent:     " + req);
			PrintWriter out = 
					new PrintWriter(sock.getOutputStream());
			out.println(req);
			out.flush();
			// Read and print the response string.
			InputStreamReader isr = 
					new InputStreamReader(sock.getInputStream());
			BufferedReader in = new BufferedReader(isr);
			String res = in.readLine();   // blocks
			System.out.println("Received: " + res);
			// Cleanup.
			sock.close();
			// Expensive, socket-based palindrome checker.
			if (req.equals(res))
				System.out.println("A palindrome!");
			else
				System.out.println("Not a palindrome!");
		} catch(IOException e) { 
			System.err.println(e); 
		}
	}
	private static final int port = 9876;
}
