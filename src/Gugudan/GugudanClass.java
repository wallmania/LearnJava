package Gugudan;

import java.util.Scanner;

public class GugudanClass {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int[] result = GugudanMethod.calculate(i);
			GugudanMethod.print(result);
			System.out.println("\n");
		}
		
		System.out.println("구구단 중 출력할 단 중 첫번째는? : ");
		Scanner scanner1 = new Scanner(System.in);
		int number1 = scanner1.nextInt();
		System.out.println("구구단 중 출력할 단 중 두번째는? : ");
		Scanner scanner2 = new Scanner(System.in);
		int number2 = scanner2.nextInt();
		
		if (number1 < 2 || number2 < 2) {
			System.out.println("2 이상의 값을 입력하셔야 합니다");
		} else if (number1 > 9 || number2 > 9) {
			System.out.println("9 이하의 값을 입력하셔야 합니다");
		} else {
			int[] result = GugudanMethod.calculate(number1, number2);
			GugudanMethod.print(result);
		}
	}
}
