package wallmania;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnException2 {
	
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
	}

}
