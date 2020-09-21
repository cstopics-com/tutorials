package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[ ] args) {
		try {
			// Open a server socket on the designated port and
			// allow up to max_conn connections at a time.
			ServerSocket ssock = new ServerSocket(port, max_conn);

			// Indefinitely wait for and handle clients.
			while (true) {
				Socket sock = ssock.accept(); // accept() blocks

				// Read the request string from the client
				InputStreamReader isr = 
						new InputStreamReader(sock.getInputStream());
				BufferedReader  in = new BufferedReader(isr);
				String req = in.readLine(); // blocks

				// Produce the response string.
				String res = 
						new StringBuffer(req).reverse().toString();
				// Write the response to the client.
				PrintWriter out = 
						new PrintWriter(sock.getOutputStream());
				out.println(res);
				out.flush();
				// Cleanup.
				sock.close();  // closes streams

			}
		} catch(IOException e) { 
			System.err.println(e); 
		}
	}
	private static final int port = 9876;
	private static final int max_conn = 100;
}
