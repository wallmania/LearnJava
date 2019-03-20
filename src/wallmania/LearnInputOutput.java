package wallmania;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;

public class LearnInputOutput {
	
	public static void main(String[] args) {
		
		// File Read -> 예외처리가 반드시 필요 (안하면 compile error 발생.)
		// read()
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("/Users/junlee/Java/workspace/hello.txt");
			int data = 0;
			
			while(true) {
				
				try {
					data = inputStream.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data : " + data);
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
