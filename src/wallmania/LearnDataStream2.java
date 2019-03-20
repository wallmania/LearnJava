package wallmania;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class LearnDataStream2 {
	
	public static void main(String[] args) {
		
		FileInputStream inputStream = null;
		DataInputStream dataInputStream = null;
		FileOutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		//---------------try---------------//
		try {
			
			// byte 단위 아닌 문자/문자열 단위로 읽기 위해 Upgrade --> DataInputStream(inputStream)
			inputStream = new FileInputStream("/Users/junlee/Java/workspace/JavaFileForDS.txt");
			dataInputStream = new DataInputStream(inputStream);
			// ***
			// writeUTF한 파일만 readUTF 가능하다. 
			// JavaFileForRead.txt는 writeUTF로 만든 것이 아니여서 readUTF 불가능하다.
			// ***
			// writeUTF한 파일 아닌 다른 txt 파일을 writeUTF로 해서 새로 만들고 그다음에 readUTF 해야 한다.
			String str = dataInputStream.readUTF();
			
			// byte 단위 아닌 문자/문자열 단위로 쓰기 위해 Upgrade --> DataOutputStream(outputStream)
			outputStream = new FileOutputStream("/Users/junlee/Java/workspace/JavaFileForDS2.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			dataOutputStream.writeUTF(str);
			
		//---------------catch---------------//	
		} catch (Exception e) {
			e.printStackTrace();
		//---------------finally---------------//	
		} finally {
			try {
				if (inputStream != null) inputStream.close();
			} catch (Exception e) { e.printStackTrace(); }
			try {
				if (dataInputStream != null) dataInputStream.close();
			} catch (Exception e) { e.printStackTrace(); }
			try {
				if (outputStream != null) outputStream.close(); 
			} catch (Exception e) { e.printStackTrace(); }
			try {
				if (dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) { e.printStackTrace(); }
		}		
	}

}
