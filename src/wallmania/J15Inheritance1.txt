package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J15Inheritance1 {
	public static void main(String[] args) {
		
		// extends 를 통해 상속받을 수 있음 
		ChildClass childClass = new ChildClass();
		
		// 상속받은 LearnParentClass의 method를 LearnChildClass에서도 실행 가 
		childClass.childFunc(); childClass.parentFunc();
		
		// privateParentFunc() --> LearnParentClass에서 사용되는 method (다만, private으로 선언)
		// learnChildClass.privateParentFunc() 실행하면 error 발생. 
		System.out.println(">> [Caution 1]" + "\n" + ">> privateParentFunc() --> ParentClass에서 사용되는 method (다만, private으로 선언)" + "\n");
		System.out.println(">> [Caution 2]" + "\n" + ">> childClass.privateParentFunc() 실행하면 error 발생." + "\n");
		
		
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

class ParentClass {
	
	int openYear = 1995;	
	
	public ParentClass() { System.out.println(">> ParentClass 객체 생성." + "\n"); }
	public void parentFunc() { System.out.println(">> .parentFunc() method 실행 성공\n"); }
	public void overRideFunc() { System.out.println(">> .overRideFunc() method 실행 성공\n"); }
	private void privateParentFunc() { System.out.println(">> .privateParentFunc() method 실행 성공\n"); }
}

class ChildClass extends ParentClass {
	public ChildClass() { System.out.println(">> ChildClass 객체 생성.\n"); }
	public void childFunc() { System.out.println(">> .childFunc() method 실행 성공\n"); }
}
