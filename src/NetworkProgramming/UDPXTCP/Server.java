package NetworkProgramming.UDPXTCP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramSocket socket = new DatagramSocket();
		
		byte[] info = "4685".getBytes();
		DatagramPacket packet = new DatagramPacket(info, info.length, address, 4684);
		
		socket.send(packet);
		
		socket.close();
		
		ServerSocket ss = new ServerSocket(4685);
		Socket s = ss.accept();
		
		if(s.isConnected()) System.out.println("TCP Socket Connected.");
		
		s.close();
		ss.close();
	}
}
