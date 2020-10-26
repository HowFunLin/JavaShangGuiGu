package NetworkProgramming.UDPXTCP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket socket = new DatagramSocket(4684);
		
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		socket.receive(packet);
		
		String info = new String(buf, 0, packet.getLength());
		int port = Integer.valueOf(info);
		
		socket.close();
		
		Socket tcpSocket = new Socket(packet.getAddress(), port);
		
		tcpSocket.close();
	}
}
