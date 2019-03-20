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
		
		try {
			inputStream = new FileInputStream("");
			dataInputStream = new DataInputStream(inputStream);
			String str = dataInputStream.readUTF();
			
			outputStream = new FileOutputStream("");
			dataOutputStream = new DataOutputStream(outputStream);
			dataOutputStream.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		//---------------finally---------------//	
		} finally {
			try {
				if (dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) { e.printStackTrace(); }
			try {
				if (outputStream != null) outputStream.close(); 
			} catch (Exception e) { e.printStackTrace(); }
			
		}
	}

}
