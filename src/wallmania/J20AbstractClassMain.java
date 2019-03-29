package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J20AbstractClassMain {
	public static void main(String[] args) {
		LearnAbstractClass ex = new LearnAbstractClass_Inherited(10, "java");
		ex.fun1(); ex.fun2();
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J20AbstractClassMain.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J20AbstractClassMain.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
