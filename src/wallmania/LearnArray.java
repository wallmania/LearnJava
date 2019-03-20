package wallmania;

//import 자동 생성 단축키 : cmd + shift + m
import java.util.Scanner;

public class LearnArray {
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
	}
}
