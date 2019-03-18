package wallmania;

import java.util.Scanner;

public class LearnIfForWhile {
	public static void main(String[] args) {
		int num1 = 10; int num2 = 20;
		
		if (num1 < num2) {
			System.out.println("num1 < num2");
		} else if (num1 > num2) {
			System.out.println("num1 > num2");
		} else {
			System.out.println("num1 = num2");
		}
		
		System.out.print("\n\n");
		
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
		
		inputNum.close();
		
		System.out.println("\n\n");
		
		System.out.print("INPUT NUMBER : ");
		Scanner inputNum2 = new Scanner(System.in);
		score = inputNum2.nextInt();
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", score, i, (score * i));
		}
		
		inputNum2.close();
	}

}
