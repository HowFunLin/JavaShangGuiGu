package NetworkProgramming.SendFileToServer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(9001);
		Socket s = ss.accept();
		
		InputStream is =  s.getInputStream();
		
		File f = new File("Receive.txt");
		FileOutputStream fos = new FileOutputStream(f);
		
		byte[] b = new byte[1024];
		int len;
		while((len = is.read(b)) != -1) 
		{
			fos.write(b, 0, len);
		}
		
		System.out.println("Send file successfully!");
		
		OutputStream os = s.getOutputStream();
		
		os.write("Server has received the file!".getBytes());
		
		fos.close();
		ss.close();
		s.close();
	}
}
