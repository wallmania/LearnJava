package wallmania;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class J13BufferReader {
	
	public static void main(String[] args) {
		
		String fileName = "/Users/junlee/Java/workspace/JavaFileForRead.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String strLine; 
			while ((strLine = br.readLine()) != null) { System.out.println(strLine); }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J13BufferReader.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J13BufferReader.txt");
			int readData = -1; 
			while((readData = fis.read()) != -1) { 
				fos.write(readData); 
			}
		} catch (Exception e) {  e.printStackTrace();
		} finally { 
			try { fos.close(); 
			} catch (Exception e) { 
				e.printStackTrace(); 
			} 
		}
	}
}
