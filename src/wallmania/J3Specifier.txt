package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J3Specifier {
	public static void main(String[] args) {
		System.out.println("띄어쓰기 : Good\t\tMorning!");
		System.out.println("줄바꿈 : \n");
		System.out.println("\' print : \'GoodMorning!\'");
		System.out.println("\" print : \"GoodMorning!\"");
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J3Specifier.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J3Specifier.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
 