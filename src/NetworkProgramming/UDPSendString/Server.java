package NetworkProgramming.UDPSendString;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server
{
	public static void main(String[] args) throws IOException
	{
		DatagramSocket socket = new DatagramSocket(4684);
		
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		socket.receive(packet);
		
		String str = new String(buf, 0, packet.getLength());
		System.out.println(str);
		
		socket.close();
	}
}
