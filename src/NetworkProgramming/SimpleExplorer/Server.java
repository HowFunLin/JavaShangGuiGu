package NetworkProgramming.SimpleExplorer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(4684);
		Socket socket = ss.accept();
		InputStream is = socket.getInputStream();
		
		byte[] b = is.readAllBytes();
		String info = new String(b);
		String filePath = info.substring(14);
		System.out.println("Sending file " + filePath);
		
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		OutputStream os = socket.getOutputStream();
		
		byte[] bu = new byte[1024];
		int len;
		while((len = fis.read(bu)) != -1)
		{
			os.write(bu, 0, len);
		}
		System.out.println("Send file successfully.");
		
		ss.close();
		socket.close();
		fis.close();
	}
}
