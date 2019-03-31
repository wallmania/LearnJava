package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J20AbstractClassMain {
	
	public static void main(String[] args) {
		
		AbstractClass ex = new AbstractClassInherited(10, "java");
		
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

abstract class AbstractClass {
	
	int num;
	String str;
	
	public AbstractClass() { System.out.println("-- AbstractClass type 객체 생성. --" + "\n"); }
	public AbstractClass(int i, String s) {
		this.num = i; 
		this.str = s;
		System.out.printf("-- AbstractClass type 객체 생성. w/ param %d, %s --\n\n", i , s);
	}
	public void fun1() { System.out.println(">> AbstractClass에서 정의된 method, fun1() 발동! (AbstractClassInherited도 해당 method 사용 가능) \n"); }
	public abstract void fun2();

}

class AbstractClassInherited extends AbstractClass {
	
	public AbstractClassInherited() { System.out.println("-- AbstractClassInherited type 객체 생성. --" + "\n"); }
	
	public AbstractClassInherited(int i, String s) {
		super(i, s);
		System.out.printf("-- AbstractClass type 객체 생성 w/ param %d, %s (상위 class로 부터 물려받은 변수) --\n\n", i , s);
	}
	@Override
	public void fun2() { System.out.println(">> AbstractClass에서 정의된 method, fun2() 발동! \n>> 상위 class인 abstract class의 fun2() method를 재정의 (Override) 해서 사용.\n"); }
}

