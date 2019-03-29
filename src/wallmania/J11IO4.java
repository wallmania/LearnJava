package wallmania;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J11IO4 {
	
	public static void main(String[] args) {
		
		// File Write -> 예외처리가 반드시 필요 (안하면 compile error 발생.)
		//
		// (1byte 단위로) 데이터 Read 하자 -> data = inputStream.read();
		//
		// ASCII Code to Char -> System.out.println((char)65) = A
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("/Users/junlee/Java/workspace/JavaFileForWrite2.txt");
			String data = "Hello wallmania, I am Java. (from LearnInputOutput4.java)";
			byte[] arr = data.getBytes();
			
			try {
				// 0번째부터 5개 저장 (H, e, l, l, o) --> outputStream.write(arr, 0, 5);
				outputStream.write(arr, 0, data.length());
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
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J11IO4.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J11IO4.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
		
	}

}
