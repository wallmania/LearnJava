package wallmania;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnInputOutput {
	
	public static void main(String[] args) {
		
		// File Read -> 예외처리가 반드시 필요 (안하면 compile error 발생.)
		//
		// (1byte 단위로) 데이터 Read 하자 -> data = inputStream.read();
		//
		// ASCII Code to Char -> System.out.println((char)65) = A
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("/Users/junlee/Java/workspace/JavaFileForRead.txt");
			int data = 0;
			while(true) {
				try { data = inputStream.read(); } catch (IOException e) { e.printStackTrace(); }
				if(data == -1) break;
				System.out.println("data : " + data + "(" + (char)data + ")");
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
	}
}
