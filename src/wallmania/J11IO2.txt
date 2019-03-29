package wallmania;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J11IO2 {
	
	public static void main(String[] args) {
		
		// File Read -> 예외처리가 반드시 필요 (안하면 compile error 발생.)
		//
		// (n byte 단위로) 데이터 Read 하자 -> data = inputStream.read(bs);
		// From 1 byte to n byte -> 좀 더 빨리 데이터를 읽을 수 있다. 
		//
		// ASCII Code to Char -> System.out.println((char)65) = A
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("/Users/junlee/Java/workspace/JavaFileForRead.txt");
			int data = 0;
			byte[] bs = new byte[3];
			while(true) {
				try { data = inputStream.read(bs); } catch (IOException e) { e.printStackTrace(); }
				if(data == -1) break;
				System.out.println("data : " + data);
				for (int i=0; i<bs.length; i++) {
					System.out.println("bs[" + i + "] : " + bs[i] + "(" + (char)bs[i] + ")");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J11IO2.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J11IO2.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
		
	}

}
