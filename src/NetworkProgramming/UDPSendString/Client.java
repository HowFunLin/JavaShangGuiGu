package NetworkProgramming.UDPSendString;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client
{
	public static void main(String[] args) throws IOException
	{
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramSocket socket = new DatagramSocket();
		
		byte[] buf = "Test".getBytes();
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4684);
		
		socket.send(packet);
		
		socket.close();
	}
}
