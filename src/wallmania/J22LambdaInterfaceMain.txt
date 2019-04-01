package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J22LambdaInterfaceMain {
	
	public static void main(String[] args) {
		
		// 매개변수와 실행문만으로 작성한다. (접근자{public}, 반환형{void}, return 키워드 생략한다)
		System.out.println("[1] LambdaInterface1 liVer1 = (String s1, String s2, String s3) -> { System.out.println(s1 + \" \" + s2 + \" \" + s3); };");
		LambdaInterface1 liVer1 = (String s1, String s2, String s3) -> { return (s1 + " " + s2 + " " + s3); };
		System.out.println(">> liVer1.method(\"Hello\", \"Java\", \"World\") = " + liVer1.method("Hello", "Java", "World"));
		System.out.print("\n\n");
		
		// 매개변수가 1개 또는 타입이 같을 때 타입을 생략할 수 있다.
		System.out.println("[2] LambdaInterface2 liVer2_1 = (s1) -> { System.out.println(s1); };");
		LambdaInterface2 liVer2_1 = (s1) -> { System.out.println(s1); };
		System.out.print(">> liVer2_1.method(\"Hello\") = "); liVer2_1.method("Hello");
		System.out.print("\n\n");
		
		// 실행문이 1개인 경우, '{}' 생략 가능하다.
		System.out.println("[3] LambdaInterface2 liVer2_2 = (s1) -> System.out.println(s1);");
		LambdaInterface2 liVer2_2 = (s1) -> System.out.println(s1);
		System.out.print(">> liVer2_2.method(\"Hello\") = "); liVer2_2.method("Hello");
		System.out.print("\n\n");
		
		// 매개변수, 실행문 모두 1개인 경우, '()', '{}' 생략 가능하다.
		System.out.println("[4] LambdaInterface2 liVer2_3 = s1 -> System.out.println(s1);");
		LambdaInterface2 liVer2_3 = s1 -> System.out.println(s1);
		System.out.print(">> liVer2_3.method(\"Hello\") = "); liVer2_3.method("Hello");
		System.out.print("\n\n");
		
		// 매개변수 없으면 '()' 만 작성한다.
		System.out.println("[5] LambdaInterface3 liVer3 = () -> System.out.println(\"no parameter\");");
		LambdaInterface3 liVer3 = () -> System.out.println("no parameter");
		System.out.print(">> liVer2_3.method(\"Hello\") = "); liVer3.method();
		System.out.print("\n\n");
		
		// 반환값이 있는 경우
		System.out.println("[6] LambdaInterface4 liVer4_1 = (x, y) -> { int result = x + y; return result; };");
		LambdaInterface4 liVer4_1 = (x, y) -> { int result = x + y; return result;};
		System.out.printf(">> 'x + y' --> liVer4_1.method(10, 20) : %d\n\n\n", liVer4_1.method(10, 20));
		
		System.out.println("[7] LambdaInterface4 liVer4_2 = (x, y) -> { int result = x * y; return result; };");
		LambdaInterface4 liVer4_2 = (x, y) -> { int result = x * y; return result; };
		System.out.printf(">> 'x * y' --> liVer4_2.method(10, 20) : %d\n\n\n", liVer4_2.method(10, 20));
		
		System.out.println("[8] LambdaInterface4 liVer4_3 = (x, y) -> { int result = x - y; return result; };");
		LambdaInterface4 liVer4_3 = (x, y) -> { int result = x - y; return result; };
		System.out.printf(">> 'x - y' --> liVer4_3.method(10, 20) : %d\n\n", liVer4_3.method(10, 20));
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J22LambdaInterfaceMain.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J22LambdaInterfaceMain.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}


interface LambdaInterface1 { public String method(String s1, String s2, String s3); }

interface LambdaInterface2 { public void method(String s1); }

interface LambdaInterface3 { public void method(); }

interface LambdaInterface4 {  public int method(int x, int y); }