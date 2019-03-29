package wallmania;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J12DataStream1 {
	
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
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J12DataStream1.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J12DataStream1.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}
