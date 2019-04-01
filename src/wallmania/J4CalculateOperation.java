package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J4CalculateOperation {
	public static void main(String[] args) {
		int x = 10; 
		int y = 10;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		System.out.println("");
		
		x = 10; System.out.println("x += 10 : " + (x += 10));
		x = 10; System.out.println("x -= 10 : " + (x -= 10));
		x = 10; System.out.println("x *= 10 : " + (x *= 10));
		x = 10; System.out.println("x /= 10 : " + (x /= 10));
		x = 10; System.out.println("x %= 10 : " + (x %= 10));
		System.out.println("");
		
		x = 10; y = 20;
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y));
		System.out.println("");
		
		x = 10; System.out.println("++x : " + (++x));
		x = 10; System.out.println("--x : " + (--x));		
		x = 10;
		System.out.println("x++ : " + (x++));
		System.out.println("x : " + x);
		x = 10;
		System.out.println("x-- : " + (x--));
		System.out.println("x : " + x);	
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J4CalculateOperation.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J4CalculateOperation.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}
