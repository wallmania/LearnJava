package wallmania;

import java.util.Scanner;

public class LearnIfForWhile {
	public static void main(String[] args) {
		int num1 = 10; int num2 = 20;
		
		if (num1 < num2) { System.out.println("num1 < num2");
		} else if (num1 > num2) { System.out.println("num1 > num2");
		} else { System.out.println("num1 = num2"); }
		System.out.print("\n");
		
		System.out.print("점수를 입력하세요. : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch((int) score/10) {
			case 10: case 9:
				System.out.println("수.");
				break;
			case 8:
				System.out.println("우.");
				break;
			case 7:
				System.out.println("미.");
				break;
			case 6:
				System.out.println("양.");
				break;
			case 5:
				System.out.println("가.");
				break;
			default:
				System.out.println("가.");
				break;
		}
		
		System.out.print("\n" + "INPUT NUMBER : ");
		score = inputNum.nextInt();
		
		// 반복문 : for, while, do while
		System.out.print("\n" + "[1] 반복문 : for" + "\n" + ">> ");
		for (int i=1; i<10; i++) { 
			System.out.printf("%d * %d = %d\t", score, i, (score * i)); 
		}
		System.out.print("\n" + "[2] 반복문 using while" + "\n" + ">> ");
		int j=1; while (j<10) { 
			System.out.printf("%d * %d = %d\t", score, j, (score*j)); j += 1; 
		}
		System.out.print("\n" + "[3] 반복문 using do while" + "\n" + ">> ");
		int k=1; do  { 
			System.out.printf("%d * %d = %d\t", score, k, (score*k)); k += 1; 
		} while (k<10);
		System.out.print("\n");
		
		inputNum.close();
	}
}
