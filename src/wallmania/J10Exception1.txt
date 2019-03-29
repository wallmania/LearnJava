package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J10Exception1 {
	public static void main(String[] args) {
		int i = 10; int j = 0; int k = 0;
		
		System.out.println("[1] Exception Before\n");
		
		try {
			k = i / j;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("[2] msg : " + msg);
		}
		
		System.out.println("\n[3] Exception After");
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J10Exception1.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J10Exception1.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}
