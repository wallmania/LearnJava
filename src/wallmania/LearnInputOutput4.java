package wallmania;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearnInputOutput4 {
	
	public static void main(String[] args) {
		
		// File Write -> 예외처리가 반드시 필요 (안하면 compile error 발생.)
		//
		// (1byte 단위로) 데이터 Read 하자 -> data = inputStream.read();
		//
		// ASCII Code to Char -> System.out.println((char)65) = A
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("/Users/junlee/Java/workspace/helloForWrite2.txt");
			String data = "Hello wallmania, I am Java.";
			byte[] arr = data.getBytes();
			
			try {
				// 0번째부터 5개 저장 (H, e, l, l, o)
				outputStream.write(arr, 0, 5);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
