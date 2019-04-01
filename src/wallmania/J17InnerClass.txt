package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J17InnerClass { 

		public static void main (String[] args) {
			
			System.out.println("------------------------------------설명.--------------------------------------");
			System.out.println(">> InnerClass --> 실무에서 많이 쓰이지 X");
			System.out.println(">> InnerClass --> 클래스 안에 또 다른 클래스를 생성 (두 클래스의 멤버에 쉽게 접근할 수 있음)\n");
			System.out.println(">> Anonymous Class는 다음과 같이 정의 X --> AnonymousClass ac = new AnonymousClass()");
			System.out.println(">> Anonymous Class는 다음과 같이 정의 O --> new AnonymousClass()");
			System.out.println(">> Anonymous Class의 method 실행방법 (1) --> new AnonymousClass() {...}.method()");
			System.out.println(">> Anonymous Class의 method 실행방법 (2) --> Override해서 실행 가능");
			System.out.println("------------------------------------------------------------------------------"  + "\n");
			
			OuterClass oc = new OuterClass();
			System.out.printf(">> oc.num(%d), oc.str1(%s)\n\n", oc.num, oc.str1);
			
			// 멤버 inner class
			OuterClass.InnerClass in = oc.new InnerClass();
			System.out.printf(">> in.num(%d), in.str2(%s)\n\n", in.num, in.str2);
			
			// static inner class
			OuterClass.StaticInnerClass sin = new OuterClass.StaticInnerClass();
			System.out.printf(">> sin.num(%d), sin.str3(%s)\n\n", sin.num, sin.str3);		
			
			// 익명(anonymous) class
			new AnonymousClass() {}.method();
			new AnonymousClass() {
				@Override
				public void method() { System.out.println(">> AnonymousClass.method()를 Override해서 실행."); };
			}.method();
			
			
			// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
			FileInputStream fis = null; FileOutputStream fos = null;
			try {
				fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J17InnerClass.java");
				fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J17InnerClass.txt");
				int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
			} catch (Exception e) {  e.printStackTrace();
			} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
		}
}

class OuterClass {
	int num = 10; String str1 = "java"; static String str11 = "world";
	
	public OuterClass() { System.out.println(">> OuterClass type 객체 생성."); }
	
	class InnerClass {
		int num = 100; String str2 = str1;
		public InnerClass() { System.out.printf(">> OuterClass의 내부 클래스인 InnerClass type 객체 생성 w/ param %d, %s\n", num, str2); }
	}
	
	static class StaticInnerClass {
		int num = 1000; String str3 = str11;
		public StaticInnerClass() { System.out.printf(">> OuterClass의 내부 클래스인 StaticInnerClass type 객체 생성 w/ param %d, %s\n", num, str3); }
	}
}

class AnonymousClass {
	public AnonymousClass() { System.out.println(">> AnonymousClass type 객체 생성."); }
	public void method() {  System.out.println(">> AnonymousClass.method() 실행."); }

}
