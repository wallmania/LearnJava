package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J10Exception2 {
	

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, j;
		ArrayList<String> list = null;
		
		int[] iArr = {0, 1, 2, 3, 4};
		
		System.out.println("Exception Before\n");
		
		try {
			// input으로 integer 입력하지 않으면 InputMismatchException 발생 (그 다음 코드는 실행 X)
			System.out.println("input i : "); i = scanner.nextInt();
			System.out.println("input j : "); j = scanner.nextInt();
			
			// divide by zero 발생하면 Exception 발생 (그 다음 코드는 실행 X)
			System.out.println("i / j = " + (i / j));
			
			// iArr 행렬의 길이는 5 -> k값이 5이상 되면 ArrayIndexOutOfBoundsException 발생 (그 다음 코드는 실행 X)
			for (int k=0; k<5; k++) {
				System.out.print("iArr[" + k + "] : " + iArr[k] + "\t");
			}
			System.out.println("");
			// 현재 list는 null이라서 list.size() 실행하면 오류 발
			System.out.println("list.size() : " + list.size());
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("msg1 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("msg2 : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("msg3 : " + e.getMessage());
		} finally {
			System.out.println("예외 발생 여부 상관없이 무조건 실행됩니다.");
		}
		
		System.out.println("Exception AFTER");
		scanner.close();
		
		// -- File 입출력 Code --  System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		String CurFileName1 = Thread.currentThread().getStackTrace()[1].toString();
		String CurFileName2 = CurFileName1.substring(CurFileName1.indexOf("(") + 1, CurFileName1.indexOf(")")).split("\\.")[0];
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/" + CurFileName2 + ".java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/" + CurFileName2 + ".txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}

}
