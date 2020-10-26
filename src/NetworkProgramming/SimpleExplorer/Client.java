package NetworkProgramming.SimpleExplorer;

import java.io.File;
import java.io.FileOutputStream;
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
		Socket socket = new Socket(inet, 4684);
		
		String in = "GET HTTP1.0  /index.jsp";
		System.out.println(in);
		byte[] b = in.getBytes();
		
		OutputStream os = socket.getOutputStream();
		os.write(b);
		
		socket.shutdownOutput();
		
		File file = new File("D:\\" + in.substring(14));
		if(!file.exists())file.createNewFile();
		
		InputStream is = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream(file);
		
		byte[] bu = new byte[1024];
		int len;
		while((len = is.read(bu)) != -1)
		{
			fos.write(bu, 0, len);
		}
		System.out.println("File saved.");
		
		socket.close();
		fos.close();
	}
}
