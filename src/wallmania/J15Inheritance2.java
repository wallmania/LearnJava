package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J15Inheritance2 {
	public static void main(String[] args) {
		
		// 모든 class의 최상위 class는 Object Class 이다. 
		// Class도 Type 이다. 
		// 배열에 담기는 객체 Type (int, String, ...) 은 모두 같아야 한다.  		
		ParentClass[] pArr = new ParentClass[2];
		
		ParentClass ch1 = new ChildClass1(); // LearnChildClass2 ch2 = new LearnChildClass2();
		ParentClass ch2 = new ChildClass2(); // LearnChildClass3 ch2 = new LearnChildClass3();
		
		// override 가능하다. 
        // 부모 Class가 가지고 있는 method와 동일한 method 이름이되 기능을 수정한 것 
        // 본인 Class 변수 접근할때는 this.{변수이름}, 부모 Class 변수 접근할때는 super.{변수이름}, 
		pArr[0] = ch1; pArr[1] = ch2;
		ch1.overRideFunc(); ch2.overRideFunc();
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J15Inheritance2.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J15Inheritance2.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}

class ParentClass {
	
	int openYear = 1995;	
	
	public ParentClass() { 
		System.out.println("ParentClass 객체 생성." + "\n"); 
	}
	public void parentFunc() { 
		System.out.println("-- {내가 생성한 객체}.parentFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
	public void overRideFunc() {
		System.out.println("-- {내가 생성한 객체}.overRideFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
	private void privateParentFunc() { 
		System.out.println("-- {내가 생성한 객체}.privateParentFunc() 하면 실행되는 method --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다." + "\n"); 
	}
}

class ChildClass1 extends ParentClass {
	
	int openYear = 2005;
	
	public ChildClass1() { System.out.println("ChildClass1 객체 생성." + "\n"); }
	
	@Override
	public void overRideFunc() {
		System.out.println("-- {내가 생성한 객체}.overRideFunc() 하면 실행되는 method --"); 
		System.out.println("-- Override 가능하다. --"); 
		System.out.println("-- ChildClass1가 상속받은 method 이름 = ParentClass의 method 이름 --> 기능 수정 가능 --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다."); 
		System.out.println(">> ChildClass1's Open Year is " + this.openYear + " by using this.openYear"); 
		System.out.println(">> ChildClass1 Open Year is " + super.openYear + " by using super.openYear" + "\n"); 
	}
}

class ChildClass2 extends ParentClass {
	
	int openYear = 2006;
	
	public ChildClass2() { 
		System.out.println("LearnChildClass3 객체 생성." + "\n"); 
	}
	
	@Override
	public void overRideFunc() {
		System.out.println("-- {내가 생성한 객체}.overRideFunc() 하면 실행되는 method --"); 
		System.out.println("-- Override 가능하다. --"); 
		System.out.println("-- ChildClass2가 상속받은 method 이름 = LearnParentClass의 method 이름 --> 기능 수정 가능 --"); 
		System.out.println(">> method가 성공적으로 실행되었습니다."); 
		System.out.println(">> ChildClass2's Open Year is " + this.openYear + " by using this.openYear"); 
		System.out.println(">> ChildClass2 Open Year is " + super.openYear + " by using super.openYear" + "\n"); 
	}
}
