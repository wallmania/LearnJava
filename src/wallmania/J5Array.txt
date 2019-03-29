package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class J5Array {
	public static void main(String[] args) {
		// 배열 선언 후 초기화 
		int[] arr1 = new int[5];
		arr1[0] = 100; arr1[1] = 200; arr1[2] = 300; arr1[3] = 400; arr1[4] = 500; 
		for (int i=0; i<5; i++) { System.out.print("arr1[" + String.valueOf(i) + "] : " + arr1[i] + "\t"); }
		System.out.println("");
		
		// 배열 선언과 동시에 초기화 
		int[] arr2 = {10, 20, 30, 40, 50};
		for (int i=0; i<5; i++) { System.out.print("arr2[" + String.valueOf(i) + "] : " + arr2[i] + "\t"); }
		System.out.print("\n\n");
		
		// 배열을 이용한 학사관리
		String[] name = {"Ho", "Lee", "Park", "Gyu", "Jin"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<5; i++) { System.out.printf("%s의 점수를 입력하시오. : ", name[i]); score[i] = scanner.nextInt(); }
		System.out.print("\n");
		for (int i=0; i<5; i++) { System.out.printf("%s 점수 : \t%.2f\n", name[i], (double)score[i]); }
		double ave = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5;
		System.out.printf("-----------------------\n평 점: \t\t%.2f\n", ave);
		scanner.close();
		
		
		
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60}; int[] arrAtt2 = null; int[] arrAtt3 = null;
		
		System.out.println("\n배열 길이 출력 (arrAtt1.length) : " + arrAtt1.length);
		System.out.println("배열 요소 출력 (arrAtt1) : " + Arrays.toString(arrAtt1));
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("배열 요소 복사 (arrAtt3) : " + Arrays.toString(arrAtt3) + "\n");
		
		// 배열 reference
		System.out.println("기본 자료형 데이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.");
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1( " + arrAtt1 + " ), arrAtt2( " + arrAtt2 + " ) arrAtt3( " + arrAtt3 +" )" + "\n");
		
		int[][] arrMul = new int[3][2];
		for (int i=0; i<3; i++) { for (int j=0; j<2; j++) { arrMul[i][j] = 10*(i+1) + 10*(j+1); } }
		System.out.println("int[][] arrMul = new int[3][2] --> 3x2 행렬 생성.");
		for (int i=0; i<3; i++) { System.out.println("arrMul[" + String.valueOf(i) + "] : " + Arrays.toString(arrMul[i])); }
		
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J5Array.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J5Array.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
