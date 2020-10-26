package NetworkProgramming.VerifyAccount;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(inet, 4684);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the Account: ");
		String account = scan.next();
		osw.write(account + "\n");
		
		osw.flush();
				
		System.out.print("Please enter the Password: ");
		String password = scan.next();
		osw.write(password);
		
		osw.flush();
		
		socket.close();
		scan.close();
	}
}
