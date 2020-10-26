package NetworkProgramming.SendStringEach;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		Socket s = new Socket(inet, 8888);
		
		OutputStream os = s.getOutputStream();
		
		String str = "siemens";
		byte[] b = str.getBytes();
		os.write(b);
		
		System.out.println("Sent string " + str);
		
		s.shutdownOutput();
		
		InputStream is = s.getInputStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] ib = new byte[10];
		int len;
		while((len = is.read(ib)) != -1)
		{
			baos.write(ib, 0, len);
		}
		
		System.out.println("Received string " + baos.toString());
		
		s.close();
	}
}
