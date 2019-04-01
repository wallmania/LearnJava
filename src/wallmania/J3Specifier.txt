package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J3Specifier {
	public static void main(String[] args) {
		System.out.println("\n식별자 (Specifier) 학습 1.");
		System.out.println(">> [1] %와 d를 이용.");
		System.out.printf(">> [2] 오늘의 기온은 %d도 입니다.\n", 10);
		System.out.printf(">> [3] 홍길동 정보 : %d학년-%d반-%d번.\n", 6, 2, 10);
		
		int num1 = 20;
		System.out.printf(">> [4-1] 오늘 기온은 " + num1 + "도 입니다.\n");
		System.out.printf(">> [4-2] 오늘 기온은 %d도 입니다.\n", num1);
		
		int num2 = 30;
		System.out.printf(">> [5-1] num2(10진수) : %d\n", num2);
		System.out.printf(">> [5-2] num2(8진수) : %o\n", num2);
		System.out.printf(">> [5-3] num2(16진수) : %x\n", num2);
		
		System.out.printf(">> [6-1] 소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'B');
		System.out.printf(">> [6-2] \'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		
		float f=1.23f; System.out.printf(">> [7-1] f = %f\n", f);
		double d=1.23456d; System.out.printf(">> [7-2] d = %f\n", d);
		
		System.out.println("\n식별자 (Specifier) 학습 2.");
		System.out.printf(">> [1] %d, %d, %d\n", 123, 1234, 12345);
		System.out.printf(">> [2] %5d, %5d, %5d\n", 123, 1234, 12345);
		System.out.printf(">> [3] %f, %.0f, %.1f, %.2f, %.3f\n", 1.23, 1.23, 1.23, 1.23, 1.23);
		
		System.out.println("\n식별자 (Specifier) 학습 3.");
		System.out.println(">> [1] 띄어쓰기 : Good\t\tMorning!");
		System.out.println(">> [2] 줄바꿈 : \n");
		System.out.println(">> [3] \' print : \'GoodMorning!\'");
		System.out.println(">> [4] \" print : \"GoodMorning!\"");
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J3Specifier.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J3Specifier.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}
