package NetworkProgramming.VerifyAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		HashMap<String, String> hs = new HashMap<String, String>();
		
		hs.put("Riyad", "123ABc");
		hs.put("Exull", "S96920");
		
		ServerSocket ss = new ServerSocket(4684);
		Socket socket = ss.accept();
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		boolean isAccount = true;
		String password = null;
		while(true)
		{
			String info = br.readLine();
			if(isAccount == true) 
			{
				if(hs.get(info) == null)
				{
					System.out.println("The user is not exist.");
					System.exit(0);
				}
				else
				{
					password = hs.get(info);
					isAccount = false;
					continue;
				}
			}
			if(info.equals(password))
			{
				System.out.println("Validation passed.");
				break;
			}
			else
			{
				System.out.println("Incorrect password.");
				break;
			}
		}
		
		ss.close();
		socket.close();
	}
}
