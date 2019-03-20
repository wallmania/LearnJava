package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LearnFileCopy {
	
	public static void main(String[] args) {
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		//---------------try---------------//
		try {
			inputStream = new FileInputStream("/Users/junlee/Java/workspace/helloForRead.txt");
			outputStream = new FileOutputStream("/Users/junlee/Java/workspace/helloForCopy.txt");
			
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
		
	}

}
