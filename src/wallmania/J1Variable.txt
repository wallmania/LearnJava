package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J1Variable {
	
	public static void main(String[] args) {
		int i = 10; System.out.println("i = " + i);
		i = 100; System.out.println("i = " + i);
		i = 300; System.out.println("i = " + i);
		i = 0; System.out.println("i = " + i);
		
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J1Variable.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J1Variable.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
