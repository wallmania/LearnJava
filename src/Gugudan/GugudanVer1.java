package Gugudan;

import java.util.Scanner;

public class GugudanVer1 {
	public static void main(String[] args) {
		
		// 2단 ~ 9단 기본 출력.
		String[][] gugudanArray = new String[9][9];
		for (int i=1; i<9; i++) {
			for (int j=1; j<10; j++) {
				gugudanArray[i-1][j-1] = String.valueOf(i+1) + " * " + String.valueOf(j) + " = " + String.valueOf((i+1)*j) + "\t";
				System.out.print(gugudanArray[i-1][j-1]); 
			}
			System.out.println("\n");
		}
		
		// 원하는 구구단만 출력.
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number < 2) { System.out.println("2 이상의 값을 입력하셔야 합니다");
		} else if (number > 9) { System.out.println("9 이하의 값을 입력하셔야 합니다");
		} else {
			int i = 1; 
			System.out.println("Gugudna is printed w/ using while loop");
			while(i < 10) { System.out.print(String.valueOf(number) + " * " + String.valueOf(i) + " = " + number * i + "\t"); i += 1;  }
			
			System.out.println("\n"+ "Gugudna is printed w/ using for loop");
			for (int j=1; j<10; j++) { System.out.print(String.valueOf(number) + " * " + String.valueOf(j) + " = " + number * j + "\t"); }
			
			System.out.println("\n"+ "Gugudna is printed w/ using array");
			for (int k=1; k<10; k++) { System.out.print(gugudanArray[number-1-1][k-1]); }
		}
		scanner.close();
	}
}
