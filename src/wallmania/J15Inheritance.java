package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J15Inheritance {
	public static void main(String[] args) {
		
		
		// extends 를 통해 상속받을 수 있음 
		ChildClass1 childClass1 = new ChildClass1();
		ChildClass2 childClass2 = new ChildClass2();
		
		
		// 상속받은 LearnParentClass의 method를 LearnChildClass에서도 실행 가 
		childClass1.childFunc(); childClass1.parentFunc();
		childClass2.childFunc(); childClass2.parentFunc();
		
		
		// privateParentFunc() --> ParentClass에서 사용되는 method (다만, private으로 선언)
		// ChildClass.privateParentFunc() 실행하면 error 발생. 
		System.out.println("\n>> [Caution 1] privateParentFunc() --> ParentClass에서 사용되는 method (다만, private으로 선언)");
		System.out.println(">> [Caution 2] childClass.privateParentFunc() 실행하면 error 발생." + "\n");
		
		
		// Class 특징 [1] 모든 class의 최상위 class는 Object Class 이다. 
		// Class 특징 [2] Class도 Type 이다. 
		// Class 특징 [3] 배열에 담기는 객체 Type (int, String, ...) 은 모두 같아야 한다.  		
		ParentClass[] pArr = new ParentClass[2];
		ParentClass ch1 = new ChildClass1(); // ChildClass1 ch2 = new ChildClass1();
		ParentClass ch2 = new ChildClass2(); // ChildClass2 ch2 = new ChildClass2();
		
		
		// override 가능하다. 
        // 부모 Class가 가지고 있는 method와 동일한 method 이름이되 기능을 수정한 것 
        // 본인 Class 변수 접근할때는 this.{변수이름}, 부모 Class 변수 접근할때는 super.{변수이름}, 
		pArr[0] = ch1; pArr[1] = ch2;
		ch1.overRideFunc(); ch2.overRideFunc();
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J15Inheritance.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J15Inheritance.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}

class ParentClass {
	
	int openYear = 1995;	
	
	public ParentClass() { System.out.println(">> ParentClass 객체 생성."); }
	public void parentFunc() { System.out.println(">> .parentFunc() method 실행 성공"); }
	public void overRideFunc() { System.out.println(">> .overRideFunc() method 실행 성공\n"); }
	private void privateParentFunc() { System.out.println(">> .privateParentFunc() method 실행 성공\n"); }
}

class ChildClass1 extends ParentClass {
	
	int openYear = 2005;
	
	public ChildClass1() { System.out.println(">> (ParentClass 객체 생성 후) ChildClass1 객체 생성."); }
	public void childFunc() { System.out.println(">> .childFunc() method 실행 성공"); }
	@Override
	public void overRideFunc() {
		System.out.println(">> .overRideFunc() method 실행."); 
		System.out.println(">> ParentClass 상속받는 ChildClass는 해당 method를 사용해야 한다. (+ Override 가능)");  
		System.out.println(">> ChildClass1's Open Year is " + this.openYear + " by using this.openYear"); 
		System.out.println(">> ParentClass's Open Year is " + super.openYear + " by using super.openYear" + "\n"); 
	}
}

class ChildClass2 extends ParentClass {
	
	int openYear = 2006;
	
	public ChildClass2() { System.out.println(">> (ParentClass 객체 생성 후) ChildClass2 객체 생성.\n"); }
	public void childFunc() { System.out.println(">> .childFunc() method 실행 성공"); }
	@Override
	public void overRideFunc() {
		System.out.println(">> .overRideFunc() method 실행."); 
		System.out.println(">> ParentClass 상속받는 ChildClass는 해당 method를 사용해야 한다. (+ Override 가능)");
		System.out.println(">> ChildClass2's Open Year is " + this.openYear + " by using this.openYear"); 
		System.out.println(">> ParentClass's Open Year is " + super.openYear + " by using super.openYear" + "\n"); 
	}
}