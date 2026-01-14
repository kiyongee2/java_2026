package network.socket2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EcoServer {
	//객체 선언
	private static ServerSocket serverSocket; 

	public static void main(String[] args) {
		System.out.println("===========================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("===========================================");
		
		//서버 시작
		startServer();
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			String key = scan.nextLine();
			if(key.toLowerCase().equals("q")) break;
		}
		scan.close();
		
		//서버 종료
		stopServer();	
	}

	private static void startServer() {
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("[서버] 연결 요청을 기다림\n");
						//클라이언트 소켓 연결 수락
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버]" + clientIp + "의 연결 요청을 수락함");
						//---------------------------------------------------------//
						//데이터 받기
						InputStream is = socket.getInputStream();
						byte[] bytes = new byte[1024];
						int readByteCount = is.read(bytes);
						String message = new String(bytes, 0, readByteCount, "utf-8");
						
						//보조 스트림 사용
						/*DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();*/
						
						//데이터 보내기
						OutputStream os = socket.getOutputStream();
						bytes = message.getBytes("utf-8");
						os.write(bytes);
						os.flush();
						//---------------------------------------------------------//
						
						/*DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message);
						dos.flush();*/
						
						socket.close(); //연결 종료
						System.out.println("[서버] 받은 데이터를 다시 보냄, " + message);
						System.out.println("[서버]" + clientIp + "의 연결을 끊음");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
