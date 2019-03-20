package wallmania;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LearnClientClass {
	public static void main (String[] args) {
		
		Socket socket = null;
		
		InputStream inputStream = null; OutputStream outputStream = null;
		DataInputStream dataInputStream = null; DataOutputStream dataOutputStream = null;
		
		Scanner scanner = null;
		
		try {
			socket = new Socket("127.0.0.1", 9000);
			System.out.println("서버 연결 완료!");
			
			inputStream = socket.getInputStream(); outputStream = socket.getOutputStream();
			dataInputStream = new DataInputStream(inputStream); dataOutputStream = new DataOutputStream(outputStream);
			
			scanner = new Scanner(System.in);
			
			while (true) {
				System.out.println("메시지 입력.");
				String outMessage = scanner.nextLine();
				dataOutputStream.writeUTF(outMessage);
				dataOutputStream.flush();
				
				String inMessage = dataInputStream.readUTF();
				System.out.println("inMessage : " + inMessage);
				
				if(outMessage.equals("STOP")) break;
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
