package NetworkProgramming.SendFileToServer;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
		Socket s = new Socket(inet, 9001);
		
		OutputStream os = s.getOutputStream();
		
		File f = new File("forCopy.txt");
		FileInputStream fis = new FileInputStream(f);
		
		byte[] b = new byte[10];
		int len;
		while((len = fis.read(b)) != -1) os.write(b, 0, len);
		
		s.shutdownOutput();
		
		InputStream is = s.getInputStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] rb = new byte[10];
		int rblen;
		while((rblen = is.read(rb)) != -1) 
		{
			baos.write(rb, 0, rblen);
		}
		
		System.out.println(baos.toString());

		fis.close();
		s.close();
	}
}
