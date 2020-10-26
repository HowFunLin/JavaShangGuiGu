package NetworkProgramming.PrintClientString;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(inet, 8899);
		
		OutputStream os =  socket.getOutputStream();
		
		String str = "This is Client!";
		byte[] b = str.getBytes();
		os.write(b);
		
		socket.close();
	}
}
