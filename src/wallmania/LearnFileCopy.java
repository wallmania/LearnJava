package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LearnFileCopy {
	
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
		
	}

}
