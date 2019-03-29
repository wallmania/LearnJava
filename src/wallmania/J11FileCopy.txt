package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J11FileCopy {
	
	public static void main(String[] args) {
		
		// 어딘가로 입력을 받아서 어딘가로 출력을 한다. (copy 하기 --> FileInputStream + FileOutputStream)
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		//---------------try---------------//
		try {
			inputStream = new FileInputStream("/Users/junlee/Java/workspace/JavaFileForRead.txt");
			outputStream = new FileOutputStream("/Users/junlee/Java/workspace/JavaFileForCopy.txt");
			
			byte[] arr = new byte[3];
			
			while(true) {
				int len = inputStream.read(arr);
				if(len == -1) break;
				outputStream.write(arr, 0, len);
			}
		//---------------catch---------------//
		} catch (Exception e) {
			e.printStackTrace();
		//---------------finally---------------//				
		} finally {
			if (inputStream != null) {
				try { inputStream.close();
				} catch (Exception e) {e.printStackTrace();}
			}
			if (outputStream != null) {
				try { outputStream.close(); 
				} catch (Exception e) {e.printStackTrace();}
			}
		}
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J11FileCopy.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J11FileCopy.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
		
	}

}
