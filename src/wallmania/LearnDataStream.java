package wallmania;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class LearnDataStream {
	
	public static void main(String[] args) {
		
		String str = "Hello Java World!! (from LearnDataStream.java)";
		FileOutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		//---------------try---------------//
		try {
			// outputStream을 dataOutputStream으로 Upgrade
			outputStream = new FileOutputStream("/Users/junlee/Java/workspace/JavaFileForDS.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			dataOutputStream.writeUTF(str);
		//---------------catch---------------//	
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
