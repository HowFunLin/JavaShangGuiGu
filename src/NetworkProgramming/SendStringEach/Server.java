package NetworkProgramming.SendStringEach;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] b = new byte[10];
		int len;
		while((len = is.read(b)) != -1)
		{
			baos.write(b, 0, len);
		}
		
		String str = baos.toString();
		System.out.println("Received string " + str);
		
		String upstr = str.toUpperCase();
		System.out.println("Sent string " + upstr);
		
		byte[] ub = upstr.getBytes();
		
		OutputStream os = s.getOutputStream();
		
		os.write(ub);
		
		s.close();
		ss.close();
	}
}
