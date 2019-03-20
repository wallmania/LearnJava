package wallmania;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LearnServerClass {
	public static void main (String[] args) {
		
		Socket socket = null; ServerSocket serverSocket = null;
		
		InputStream inputStream = null; OutputStream outputStream = null;
		DataInputStream dataInputStream = null; DataOutputStream dataOutputStream = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("[1] 클라이언트 맞을 준비 완료!");
			
			socket = serverSocket.accept();
			System.out.println("[2] 클라이언트 연결 성공! w/ socket info (" + socket + ")");
			
			inputStream = socket.getInputStream(); outputStream = socket.getOutputStream();
			dataInputStream = new DataInputStream(inputStream); dataOutputStream = new DataOutputStream(outputStream);
			
			while (true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println("clientMessage : " + clientMessage);
				dataOutputStream.writeUTF("메시지 전송 완료!");
				dataOutputStream.flush();
	
				if(clientMessage.equals("STOP")) break;
			}
		} catch (Exception e) { e.printStackTrace();
		} finally {
			try {
				// 메모리 반환하기 
				if(dataOutputStream != null) dataOutputStream.close();
				if(outputStream != null) outputStream.close();
				if(dataInputStream != null) dataInputStream.close();
				if(inputStream != null) inputStream.close();
				
				if(socket != null) socket.close();
				
			} catch (Exception e) { e.printStackTrace(); }
		}
	}

}
