package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J15Inheritance1 {
	public static void main(String[] args) {
		
		// extends 를 통해 상속받을 수 있음 
		LearnChildClass learnChildClass = new LearnChildClass();
		// 상속받은 LearnParentClass의 method를 LearnChildClass에서도 실행 가 
		learnChildClass.childFunc();
		learnChildClass.parentFunc();
		// privateParentFunc() --> LearnParentClass에서 사용되는 method (다만, private으로 선언)
		// learnChildClass.privateParentFunc() 실행하면 error 발생. 
		System.out.println("[Caution 1]" + "\n" + ">> privateParentFunc() --> LearnParentClass에서 사용되는 method (다만, private으로 선언)" + "\n");
		System.out.println("[Caution 2]" + "\n" + ">> learnChildClass.privateParentFunc() 실행하면 error 발생." + "\n");
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J15Inheritance1.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J15Inheritance1.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
