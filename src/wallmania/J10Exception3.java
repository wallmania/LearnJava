package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J10Exception3 {
	
	// thirdMethod() 에서 Exception 발생시 예외처리를 나를 호출한 곳으로 보내버린다. (to secondMethod())
	// secondMethod() 에서 Exception 발생시 예외처리를 나를 호출한 곳으로 보내버린다. (to firstMethod())
	// firstMethod() 에서 Exception 발생시 예외처리를 나를 호출한 곳으로 보내버린다. (e.printStackTrace() 실)
	public void firstMethod() throws Exception { secondMethod(); }
	public void secondMethod() throws Exception { thirdMethod(); }	
	public void thirdMethod() throws Exception { System.out.println("10 / 0 = " + (10 / 0)); }
	
	public static void main(String[] args) {
		
		J10Exception3 exception3 = new J10Exception3();
		try { exception3.firstMethod();
		} catch (Exception e) { e.printStackTrace(); }
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J10Exception3.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J10Exception3.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
