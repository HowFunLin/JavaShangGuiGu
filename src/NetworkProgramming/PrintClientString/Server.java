package NetworkProgramming.PrintClientString;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(8899);
		Socket s = ss.accept();
		
		InputStream is =  s.getInputStream();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] b = new byte[5];
		int len;
		while((len = is.read(b)) != -1) baos.write(b, 0, len);
		
		System.out.println(baos.toString());
		System.out.println(s.getInetAddress().getHostAddress());

		ss.close();
	}
}
