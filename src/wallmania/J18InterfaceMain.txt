package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J18InterfaceMain {
	public static void main(String[] args) {
		InterfaceA ia = new InterfaceClass();
		InterfaceB ib = new InterfaceClass();
		
		ia.funA(); ib.funB();
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J18InterfaceMain.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J18InterfaceMain.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
		
	}
}

interface InterfaceA { public void funA(); }

interface InterfaceB { public void funB(); }

class InterfaceClass implements InterfaceA, InterfaceB {
	
	public InterfaceClass() { System.out.println("-- InterfaceClass type 객체 생성. --" + "\n"); }

	@Override
	public void funA() { System.out.println(">> InterfaceA에 정의된 funA() method는 공란 & InterfaceClass에서 해당 method를 Override하여 실행. "); }
	
	@Override
	public void funB() { System.out.println(">> InterfaceB에 정의된 funB() method는 공란 & InterfaceClass에서 해당 method를 Override하여 실행. "); }
}