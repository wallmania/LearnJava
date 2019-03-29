package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J2DataType {
	public static void main(String[] args) {
		char c = 'a'; System.out.println("c = " + c);
		int i = 10; System.out.println("i = " + i);
		double d = 10.258; System.out.println("d = " + d);
		boolean b = false; System.out.println("b = " + b);
		String s = "Hello Java World!"; System.out.println("s = " + s);
		
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J2DataType.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J2DataType.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
