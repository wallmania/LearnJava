package program.middle;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyIOExample {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/program/middle/MyIOExample.java");
			fos = new FileOutputStream("src/program/middle/byte.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) { fos.write(readData); }
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
