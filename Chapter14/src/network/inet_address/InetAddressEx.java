package network.inet_address;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			//내 컴 
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local.getHostAddress());
			
			//서버
			InetAddress[] servers = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : servers)
				System.out.println("Naver IP:" + remote);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
